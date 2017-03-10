package com.tianxing.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianxing on 2017/3/10.
 */
public class Memento {
    int money;
    ArrayList fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit){
        fruits.add(fruit);
    }

    public List getFruits(){
        return (List)fruits.clone();
    }
}
