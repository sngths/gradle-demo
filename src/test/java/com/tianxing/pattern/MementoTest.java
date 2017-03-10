package com.tianxing.pattern;

import com.tianxing.pattern.memento.Gamer;
import com.tianxing.pattern.memento.Memento;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/10.
 * 备忘录模式
 */
public class MementoTest {

    @Test
    public void test(){
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=== " + i);
            System.out.println("当前状态:" + gamer);

            gamer.bet();

            System.out.println("所持金钱为:" + gamer.getMoney() + "元。");
            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("所持金钱增多,保持当前状态");
                memento = gamer.createMemento();
            }else if (gamer.getMoney() < memento.getMoney()){
                System.out.println("所持金钱减少, 恢复到以前的状态");
                gamer.restoreMemento(memento);
            }

            //等待
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
