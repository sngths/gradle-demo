package com.tianxing.pattern.command;

/**
 * Created by tianxing on 2017/3/14.
 */
public class BuyStock implements Command {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
