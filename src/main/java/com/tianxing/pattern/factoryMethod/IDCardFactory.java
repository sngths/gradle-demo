package com.tianxing.pattern.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianxing on 2017/3/8.
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
