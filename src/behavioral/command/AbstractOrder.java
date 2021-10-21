package behavioral.command;

public abstract class AbstractOrder implements Order {
    protected Stock stock;

    public AbstractOrder(Stock stock) {
        this.stock = stock;
    }
}
