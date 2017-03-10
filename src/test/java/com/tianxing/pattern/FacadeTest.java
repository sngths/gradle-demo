package com.tianxing.pattern;

import com.tianxing.pattern.Facade.PageMaker;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/10.
 * 外观模式
 */
public class FacadeTest {

    @Test
    public void test(){
        PageMaker.makeWelcomePage("user1@mail.com");
    }
}
