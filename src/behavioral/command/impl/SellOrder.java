package behavioral.command.impl;

import behavioral.command.AbstractOrder;
import behavioral.command.Stock;

public class SellOrder extends AbstractOrder {
    public SellOrder(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
