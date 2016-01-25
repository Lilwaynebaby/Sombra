package jv.webshop.models.user;

import jv.webshop.models.product.Basket;
import jv.webshop.models.product.Product;

import java.util.HashMap;

/**
 * Created by Владимир on 19.01.2016.
 */
public class User extends Base {
    private String login;
    private String mail;
    Basket basket;
    Product product;
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private Role role;

    public User() {
    }

    public User(final int id, final String login, final String mail) {
        this.id = id;
        this.login = login;
        this.mail = mail;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }
    public void addToBasket(){
        this.basket.addProduct(this.product);
    }
    public void subWithBasket(){
        this.basket.removeProduct(this.product);
    }
}

