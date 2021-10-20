package behavioral.strategy.example;

import behavioral.strategy.example.impl.Payment;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ShoppingCartTest {

	@ParameterizedTest
	@EnumSource(value = Payment.class)
	public void testShoppingCartTest(Payment payment) {
		ShoppingCart cart = new ShoppingCart(payment);
		
		Item item1 = new Item("1234",10000);
		Item item2 = new Item("5678",40000);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by credit card
		cart.pay("Jongdae Han", "1234567890123456", "786", "12/15");
	}

}
