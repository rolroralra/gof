package creational.builder.vo;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item: items) {
            cost += item.price();
        }

        // TODO: implement for Stream Lambda
//        items.stream().reduce(0.0f, (prevResult, input) -> prevResult + input.price())

        return cost;
    }

    public void showItems() {
        for (Item item: items) {
            System.out.println(item.description());
        }
    }
}
