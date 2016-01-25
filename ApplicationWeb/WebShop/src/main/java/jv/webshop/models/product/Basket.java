package jv.webshop.models.product;

import java.util.HashMap;

/**
 * Created by Владимир on 25.01.2016.
 */
public class Basket {
    HashMap<Integer,Product> basket = new HashMap<Integer,Product>();
    Basket(){
    }

    public void addProduct(Product product){
        this.basket.put(product.getId(),product);
    }
    public void removeProduct(Product product){
        this.basket.remove(product);
    }

}
