package com.tianxing.pattern;

import com.tianxing.pattern.prototype.Manager;
import com.tianxing.pattern.prototype.MessageBox;
import com.tianxing.pattern.prototype.Product;
import com.tianxing.pattern.prototype.UnderlinePen;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 *
 */
public class PrototypeTest {

    @Test
    public void test(){
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("underline pen", underlinePen);
        manager.register("warning box", messageBox1);
        manager.register("slash box", messageBox2);

        Product p1 = manager.create("underline pen");
        p1.use("hello");
        Product p2 = manager.create("warning box");
        p2.use("hello");
        Product p3 = manager.create("slash box");
        p3.use("hello");
    }
}
