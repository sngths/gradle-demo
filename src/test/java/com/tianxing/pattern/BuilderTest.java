package com.tianxing.pattern;

import com.tianxing.pattern.builder.Director;
import com.tianxing.pattern.builder.TextBuilder;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/8.
 */
public class BuilderTest {

    @Test
    public void test(){
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.constract();
        System.out.println(builder.getResult());
    }
}
