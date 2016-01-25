package jv.webshop.models.product;

/**
 * Created by Владимир on 25.01.2016.
 */
public abstract class Base {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}