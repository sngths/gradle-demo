package com.tianxing.pattern.state;

/**
 * Created by tianxing on 2017/3/10.
 */
public class NightState implements State {
    private static NightState nightState = new NightState();
    private NightState(){}

    public static State getInstance(){
        return nightState;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (9<= hour && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUSer(Context context) {
        context.callSecurityCenter("紧急:晚上使用金库! ");
    }

    @Override
    public void doAlarm(Context context) {
context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
