package behavioral.strategy.example;

public interface PaymentStrategy {
    void pay(ShoppingCart shoppingCart, Object... args);
}
