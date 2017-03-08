package com.tianxing.pattern.factoryMethod;

/**
 * Created by tianxing on 2017/3/8.
 */
public class IDCard extends Product{
    private String owner;

    public IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
