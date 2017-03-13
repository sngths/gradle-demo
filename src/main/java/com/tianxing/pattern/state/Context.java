package com.tianxing.pattern.state;

/**
 * Created by tianxing on 2017/3/10.
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
