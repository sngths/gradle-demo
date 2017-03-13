package com.tianxing.pattern.state;

/**
 * Created by tianxing on 2017/3/10.
 */
public interface State {
    void doClock(Context context, int hour);
    void doUSer(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
