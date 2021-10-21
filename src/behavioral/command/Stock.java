package behavioral.command;

import lombok.Data;

@Data
public class Stock {
    private String name;
    private int price;
    private int quantity;

    public Stock(String name) {
        this(name, 0, 0);
    }

    public Stock(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.printf("[BUY] %s ... -%d%n", this, totalPriceValue());
    }

    public void sell() {
        System.out.printf("[SELL] %s ... +%d%n", this, totalPriceValue());
    }

    private long totalPriceValue() {
        return (long) price * quantity;
    }

}
