package creational.builder.test;

import creational.builder.MealBuilder;
import creational.builder.vo.*;
import org.junit.jupiter.api.Test;

public class TestBattleBuilder {
    @Test
    public void test_Builder_Pattern() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal01 = mealBuilder.addItem(new VegBurger()).addItem(new Sprite()).build();
        meal01.showItems();
        System.out.println(meal01.getCost());

        System.out.println();

        Meal meal02 = new MealBuilder().addItem(new ChickenBurger()).addItem(new Coke()).build();
        meal02.showItems();
        System.out.println(meal02.getCost());

        System.out.println();

        Meal meal03 = new MealBuilder(meal01).addItem(new ChickenBurger()).addItem(new Coke()).build();
        meal03.showItems();
        System.out.println(meal03.getCost());
    }
}
