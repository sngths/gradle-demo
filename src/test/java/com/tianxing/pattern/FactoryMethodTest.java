package com.tianxing.pattern;

import com.tianxing.pattern.factoryMethod.Factory;
import com.tianxing.pattern.factoryMethod.IDCard;
import com.tianxing.pattern.factoryMethod.IDCardFactory;
import com.tianxing.pattern.factoryMethod.Product;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 */
public class FactoryMethodTest {

    @Test
    public void test(){
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("user1");
        Product product2 = factory.create("user2");
        product1.use();
        product2.use();
    }
}
