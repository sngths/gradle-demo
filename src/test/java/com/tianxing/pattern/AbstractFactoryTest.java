package com.tianxing.pattern;

import com.tianxing.pattern.abstractFactory.AbstractFactory;
import com.tianxing.pattern.abstractFactory.Color;
import com.tianxing.pattern.abstractFactory.FactoryProducer;
import com.tianxing.pattern.abstractFactory.Shape;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/14.
 * 抽象工厂模式
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();


    }
}
