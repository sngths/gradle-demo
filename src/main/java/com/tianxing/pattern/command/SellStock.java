package com.tianxing.pattern.command;

/**
 * Created by tianxing on 2017/3/14.
 */
public class SellStock implements Command {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
