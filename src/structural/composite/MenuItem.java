package structural.composite;

import lombok.Getter;

@Getter
public class MenuItem extends MenuComponent {
    private final double price;
    private final boolean isVegetarian;

    public MenuItem(String name, String description, double price) {
        this(name, description, price, false);
    }

    public MenuItem(String name, String description, double price, boolean isVegetarian) {
        super(name, description);
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public boolean isVegetarian() {
        return super.isVegetarian();
    }

    @Override
    public void print() {
        System.out.printf("[%s] name: %s, description: %s, price: %.1f%n", this.getClass().getSimpleName(), this.getName(), this.getDescription(), this.getPrice());
    }
}
