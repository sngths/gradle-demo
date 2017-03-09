package com.tianxing.pattern.Bridge;

/**
 * Created by tianxing on 2017/3/9.
 * 功能层次
 */
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 通过继承父类 增加新的功能
     * */
    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
