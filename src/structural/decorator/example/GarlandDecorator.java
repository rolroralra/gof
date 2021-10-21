package structural.decorator.example;

public class GarlandDecorator extends TreeDecorator {

    public GarlandDecorator(ChristmasTree tree) {
        super(tree);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
