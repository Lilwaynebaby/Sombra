package jv.webshop.store;

import jv.webshop.models.user.User;

import java.util.Collection;

/**
 * Created by Владимир on 23.01.2016.
 */
public interface Storage <T>{

    public Collection<T> values();

    public int add(final User user);

    public void edit(final User user);

    public void delete(final int id);

    public User get(final int id);

    public User findByLogin(final String login) ;

    public User findByMail(final String mail);

    public Collection<User> findByRoleName(final String roleName);

    public int generateId();

    public void close();
}