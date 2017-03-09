package com.tianxing.pattern.chainOfResponsibility;

/**
 * Created by tianxing on 2017/3/9.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
