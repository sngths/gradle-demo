package com.tianxing.pattern;

import com.tianxing.pattern.strategy.Hand;
import com.tianxing.pattern.strategy.Player;
import com.tianxing.pattern.strategy.ProbStrategy;
import com.tianxing.pattern.strategy.WinningStrategy;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/9.
 * 策略模式
 */
public class StrategyTest {

    @Test
    public void test() {
        Player player1 = new Player("player1", new WinningStrategy(314));
        Player player2 = new Player("player2", new ProbStrategy(15));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
