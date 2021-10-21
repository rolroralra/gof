package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Order> orderList;

    public Invoker() {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void executeAllOrders() {
        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }
}
