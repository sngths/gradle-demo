package com.tianxing.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tianxing on 2017/3/10.
 *
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer:observers) {
            observer.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
