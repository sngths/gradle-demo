package com.tianxing.pattern.state;

/**
 * Created by tianxing on 2017/3/10.
 */
public class DayState  implements State{
    private static DayState dayState = new DayState();
    private DayState(){}

    public static State getInstance(){
        return dayState;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17<= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUSer(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
