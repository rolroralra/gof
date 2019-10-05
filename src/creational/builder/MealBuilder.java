package creational.builder;

import creational.builder.vo.Item;
import creational.builder.vo.Meal;

public class MealBuilder {

    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public MealBuilder(Meal meal) {
        this.meal = meal;
    }

    public Meal build() {
        return this.meal;
    }

    public MealBuilder addItem(Item item) {
        this.meal.addItem(item);
        return this;
    }

}
