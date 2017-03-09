package com.tianxing.pattern.chainOfResponsibility;

/**
 * Created by tianxing on 2017/3/9.
 * 不处理 推给下一个处理者
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
