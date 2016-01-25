package jv.webshop.models.product;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Владимир on 25.01.2016.
 */
public class Product extends Base {

    private String description;
    private String name;

    public Product(){};

    public Product(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }
    public void setId(int id) {

        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
