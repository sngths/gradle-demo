package com.tianxing.pattern;

import com.tianxing.pattern.chainOfResponsibility.*;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/9.
 */
public class ChainOfResponsibilityTest {
    @Test
    public void test(){
        Support s1 = new NoSupport("user1");
        Support s2 = new LimitSupport("user2", 100);
        Support s3 = new SpecialSupport("user3", 429);
        Support s4 = new LimitSupport("user4", 200);
        Support s5 = new OddSupport("user5");
        Support s6 = new LimitSupport("user6", 300);
        s1.setNext(s2).setNext(s3).setNext(s4).setNext(s5).setNext(s6);
        for (int i = 0; i < 500; i++) {
            s1.support(new Trouble(i));
        }
    }

}
