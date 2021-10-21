package behavioral.command.impl;

import behavioral.command.AbstractOrder;
import behavioral.command.Stock;

public class BuyOrder extends AbstractOrder {
    public BuyOrder(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
