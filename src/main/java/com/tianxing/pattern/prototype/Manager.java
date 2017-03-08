package com.tianxing.pattern.prototype;

import java.util.HashMap;

/**
 * Created by tianxing on 2017/3/8.
 *
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    public Product create(String proto){
        Product product = (Product) showcase.get(proto);
        return product.createClone();
    }
}
