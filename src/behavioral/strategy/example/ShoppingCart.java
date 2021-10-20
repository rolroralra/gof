package behavioral.strategy.example;


import behavioral.strategy.example.impl.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	//List of items
	private List<Item> items;
	private Payment payment;
	
	public ShoppingCart(){
		this(Payment.getDefault());
	}

	public ShoppingCart(Payment payment) {
		this.items = new ArrayList<>();
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(Object... args) {
		payment.pay(this, args);
	}
}
