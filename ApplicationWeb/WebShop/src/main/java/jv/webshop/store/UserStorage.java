package jv.webshop.store;

import jv.webshop.models.user.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Collection;

/**
 * Created by Владимир on 22.01.2016.
 */
public class UserStorage implements Storage {
    private final SessionFactory factory;


    public UserStorage() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public interface Command<T> {
        T process(Session session);
    }

    private <T> T transaction(final Command<T> command) {
        final Session session = factory.openSession();
        final Transaction tx = session.beginTransaction();
        try {
            return command.process(session);
        } finally {
            tx.commit();
            session.close();
        }

    }

    public Collection<User> values() {
        return transaction((Session session) -> session.createQuery("from User").list());
    }

    @Override
    public int add(User user) {
       return transaction(
               (Session session) -> {
                   session.save(user);
                   return user.getId();
               }
       );

    }

    @Override
    public void edit(User user) {
        transaction(
                (Session session) -> {
                    session.update(user);
                    return null;
                }
            );
    }

    @Override
    public void delete(int id) {
        transaction(
                (Session session) ->{
                    session.delete(get(id));
                    return null;
                }
        );
    }
    @Override
    public User get(int id) {
       return transaction(
                (Session session) -> {
                    return (User) session.get(User.class, id);
                }
        );
    }

    @Override
    public User findByLogin(String login) {
        return transaction(
                (Session session) -> {
                    final Query query= session.createQuery("from User as user where user.login=:login");
                    query.setString("login" ,login);
                    return (User) query.iterate().next();
                }
        );
    }

    @Override
    public User findByMail(String mail) {
        return transaction(
                (Session session)->{
                    final Query query = session.createQuery("from  User as user where user.mail=:mail");
                    query.setString("mail",mail);
                    return (User) query.iterate().next();
                }
        );
    }

    @Override
    public Collection<User> findByRoleName(String roleName) {
        return transaction(
                (Session session) ->{
                    final Query query = session.createQuery("from User as user inner join user.role as role on role.name=:name");
                    query.setString("name",roleName);
                    return query.list();
                }
        );
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {

    }
}



