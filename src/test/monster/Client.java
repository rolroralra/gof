package test.monster;

import org.junit.jupiter.api.RepeatedTest;
import test.monster.factory.RandomElementFactory;

public class Client {
	@RepeatedTest(5)
	public void test() {
		Monster monster = new Monster(new RandomElementFactory());
		monster.attack();
		
		System.out.println();
		System.out.println("Factory Method: Random Decorator Random Factory");
		System.out.println();
		monster.imbue();
		monster.attack();
		System.out.println();
	}
}
	