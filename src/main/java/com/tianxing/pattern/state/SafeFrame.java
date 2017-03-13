package com.tianxing.pattern.state;

import java.util.Scanner;

/**
 * Created by tianxing on 2017/3/10.
 * 操作入口
 */
public class SafeFrame implements Context{

    private State state = DayState.getInstance();

    public SafeFrame(String title){

        start();
    }


    private void start(){
        new Thread(() -> {
            System.out.println("选择操作:");
            System.out.println("1:使用金库  2:按下警铃  3:正常通话  4:结束");
            Scanner scanner = new Scanner(System.in);
            for (;;){
                try{
                    switch (Integer.valueOf(scanner.nextLine())){
                        case 1:
                            state.doUSer(this);
                            break;
                        case 2:
                            state.doAlarm(this);
                            break;
                        case 3:
                            state.doPhone(this);
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("输入错误");
                            break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("输入错误");
                }


            }
        }).start();
    }


    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是 ";
        if (hour < 10){
            clockString += "0" + hour + ":00";
        }else {
            clockString += hour + ":00";
        }
        //System.out.println(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "state。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        System.out.println("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        System.out.println("record..." + msg + "\n");
    }
}
