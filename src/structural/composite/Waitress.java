package structural.composite;

public class Waitress {

    MenuComponent masterMenu;

    public Waitress(MenuComponent masterMenu) {
        this.masterMenu = masterMenu;
    }

    public void printMenu() {
        masterMenu.print();
    }

    public void printVegetarianMenu() {
        
    }

}
