package behavioral.command.test;

import behavioral.command.Invoker;
import behavioral.command.Stock;
import behavioral.command.impl.BuyOrder;
import behavioral.command.impl.SellOrder;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    void test_Command_Pattern() {
        Invoker invoker = new Invoker();
        Stock[] stockArray = new Stock[]{
                new Stock("Samsung", 70000, 100),
                new Stock("Kakao", 120000, 30),
                new Stock("Naver", 320000, 15),
        };

        invoker.addOrder(new BuyOrder(stockArray[0]));
        invoker.addOrder(new BuyOrder(stockArray[1]));
        invoker.addOrder(new SellOrder(stockArray[2]));

        invoker.executeAllOrders();
    }
}
