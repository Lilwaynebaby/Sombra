package jv.webshop.store;

import jv.webshop.models.user.User;
import jv.webshop.models.product.Product;

import java.util.Collection;

/**
 * Created by Владимир on 25.01.2016.
 */
public class ProductStorage implements Storage {
    @Override
    public Collection<Product> values() {
        return null;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    @Override
    public User findByMail(String mail) {
        return null;
    }

    @Override
    public Collection<User> findByRoleName(String roleName) {
        return null;
    }

    @Override
    public int generateId() {
        return 0;
    }

    @Override
    public void close() {

    }
}
