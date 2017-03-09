package com.tianxing.pattern.strategy;

/**
 * Created by tianxing on 2017/3/9.
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0;//表示石头
    public static final int HANDVALUE_CHO = 1;//表示剪刀
    public static final int HANDVALUE_PAA = 3;//不是布

    public static final Hand[] hand = {new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA)};

    public static final String[] name = {"石头", "剪刀", "布"};

    private int handvalue;

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    //胜出返回true
    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    //输了返回true
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }


    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == hand.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handvalue];
    }
}
