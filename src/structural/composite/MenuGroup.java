package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuGroup extends MenuComponent {
    List<MenuComponent> menuItemList;

    public MenuGroup(String name, String description) {
        super(name, description);
        this.menuItemList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuItemList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuItemList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuItemList.get(index);
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        System.out.printf("[%s] name: %s, description: %s%n", this.getClass().getSimpleName(), this.getName(), this.getDescription());
        System.out.println();
        this.menuItemList.forEach(MenuComponent::print);
        System.out.println();
    }
}
