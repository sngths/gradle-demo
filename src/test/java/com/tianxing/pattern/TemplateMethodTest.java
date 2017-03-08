package com.tianxing.pattern;

import com.tianxing.pattern.templateMethod.AbstractDisplay;
import com.tianxing.pattern.templateMethod.CharDisplay;
import com.tianxing.pattern.templateMethod.StringDisplay;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 */
public class TemplateMethodTest {

    @Test
    public void test(){
        AbstractDisplay display1 = new CharDisplay('A');
        AbstractDisplay display2 = new StringDisplay("Hello");
        display1.display();
        display2.display();
    }
}
