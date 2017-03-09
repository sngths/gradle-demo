package com.tianxing.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tianxing on 2017/3/9.
 */
public class Directory extends Entry {
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Object o:dir) {
            size +=((Entry)o).getSize();
        }
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Entry add(Entry entry){
        dir.add(entry);
        return this;
    }

    public Iterator iterator(){
        return dir.iterator();
    }
}
