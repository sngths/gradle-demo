package com.tianxing.pattern.builder;

/**
 * Created by tianxing on 2017/3/8.
 * 调用建造者 创建对应的对象
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void constract(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{"早上好", "下午好"});
        builder.makeString("晚上");
        builder.makeItems(new String[]{"晚上好", "晚安", "再见"});
        builder.close();
    }
}
