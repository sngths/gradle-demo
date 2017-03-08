package com.tianxing.pattern.factoryMethod;

/**
 * Created by tianxing on 2017/3/8.
 * 抽象工厂 将实例的生成方式 交给子类去实现
 */
public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    abstract Product createProduct(String owner);
    abstract void registerProduct(Product product);
}
