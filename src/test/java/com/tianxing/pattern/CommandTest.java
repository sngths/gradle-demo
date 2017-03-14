package com.tianxing.pattern;

import com.tianxing.pattern.command.Broker;
import com.tianxing.pattern.command.BuyStock;
import com.tianxing.pattern.command.SellStock;
import com.tianxing.pattern.command.Stock;
import org.junit.Test;

/**
 * Created by tianxing on 2017/3/14.
 * 命令模式
 */
public class CommandTest {

    @Test
    public void test(){
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeCommand(buyStock);
        broker.takeCommand(sellStock);

        broker.placeCommands();
    }
}
