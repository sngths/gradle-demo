package com.tianxing.gradle;

import org.junit.Test;

import java.util.Random;

/**
 * Created by tianxing on 17/3/3.
 */
public class HashTest {

    @Test
    public void hash(){
        int a = 0;
        int b = 0;
        int c = 0;
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            Integer integer = random.nextInt();
            int h = integer.hashCode();
            //h += (h <<15) ^ 0xffffcd7d;

            h ^= (h >> 10);
            h += (h << 3);
            h ^= (h >> 6);
            h += (h << 2) + (h << 14);
            h ^= (h >>> 16);
            h = h%3;
            if (h == 0){
                a++;
            }else if (h == 1){
                b++;
            }else {
                c++;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
