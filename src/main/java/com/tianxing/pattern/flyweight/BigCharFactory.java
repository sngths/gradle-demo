package com.tianxing.pattern.flyweight;

import java.util.HashMap;

/**
 * Created by tianxing on 2017/3/13.
 */
public class BigCharFactory {
    private HashMap<String , BigChar> pool = new HashMap<>();
    private static  BigCharFactory instance = new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance(){
        return instance;
    }


    public synchronized BigChar getBigChar(char charName){
        BigChar bigChar = pool.get("" + charName);
        if (bigChar == null){
            bigChar = new BigChar(charName);
            pool.put("" + charName, bigChar);
        }
        return bigChar;
    }

}
