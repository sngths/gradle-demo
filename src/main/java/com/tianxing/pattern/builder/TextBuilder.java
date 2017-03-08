package com.tianxing.pattern.builder;

/**
 * Created by tianxing on 2017/3/8.
 * 建造者的子类实现
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();


    @Override
    public void makeTitle(String title) {
        buffer.append("=====================\n");
        buffer.append("『").append(title).append("』\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■').append(str).append("\n").append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  •").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=====================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
