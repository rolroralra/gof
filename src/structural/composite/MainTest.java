package structural.composite;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void test() {
        MenuComponent masterMenuGroup = new MenuGroup("Master Group", "This is master menu group.");

        MenuComponent burgerMenuGroup = new MenuGroup("Burger Group", "This is burger menu group.");
        MenuComponent largeBurgerMenuGroup = new MenuGroup("Large Burger Group", "This is large burger menu group.");

        MenuComponent coldDrinkMenuGroup = new MenuGroup("ColdDrink Group", "This is coldDrink menu group.");
        MenuComponent largeColdDrinkMenuGroup = new MenuGroup("Large ColdDrink Group", "This is large coldDrink menu group.");

        masterMenuGroup.add(burgerMenuGroup);
        masterMenuGroup.add(coldDrinkMenuGroup);

        burgerMenuGroup.add(new MenuItem("ChickenBurger", "This is ChickenBurger.", 1000.0));
        burgerMenuGroup.add(new MenuItem("VegBurger", "This is VegBurger.", 850.0, true));
        burgerMenuGroup.add(new MenuItem("StakeBurger", "This is StakeBurger.", 1250.0));
        burgerMenuGroup.add(largeBurgerMenuGroup);

        largeBurgerMenuGroup.add(new MenuItem("ChickenLargeBurger", "This is ChickenBurger.", 1100.0));
        largeBurgerMenuGroup.add(new MenuItem("VegLargeBurger", "This is VegBurger.", 950.0, true));
        largeBurgerMenuGroup.add(new MenuItem("StakeLargeBurger", "This is StakeBurger.", 1350.0));


        coldDrinkMenuGroup.add(new MenuItem("Coke", "This is Coke.", 500.0));
        coldDrinkMenuGroup.add(new MenuItem("Sprite", "This is Sprite.", 470.0));
        coldDrinkMenuGroup.add(new MenuItem("Apple Juice", "This is Apple Juice.", 490.0, true));
        coldDrinkMenuGroup.add(largeColdDrinkMenuGroup);

        largeColdDrinkMenuGroup.add(new MenuItem("Large Coke", "This is Large Coke.", 550.0));
        largeColdDrinkMenuGroup.add(new MenuItem("Large Sprite", "This is Large Sprite.", 520.0));
        largeColdDrinkMenuGroup.add(new MenuItem("Large Apple Juice", "This is Large Apple Juice.", 540.0, true));

        masterMenuGroup.print();
    }
}
