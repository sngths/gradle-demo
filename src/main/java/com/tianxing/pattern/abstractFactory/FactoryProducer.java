package com.tianxing.pattern.abstractFactory;

/**
 * Created by tianxing on 2017/3/14.
 */
public class FactoryProducer {

    public  static  AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
