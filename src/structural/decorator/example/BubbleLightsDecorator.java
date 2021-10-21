package structural.decorator.example;

public class BubbleLightsDecorator extends TreeDecorator {

    public BubbleLightsDecorator(ChristmasTree tree) {
        super(tree);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
    
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
