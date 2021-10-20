package behavioral.strategy.example;

public interface PayStrategy {
    void pay(ShoppingCart shoppingCart, Object... args);
}
