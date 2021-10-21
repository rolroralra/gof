package structural.decorator.example;


import org.junit.jupiter.api.Test;

public class DecoratorPatternDriver {

    @Test
    public void test_Decorator_Pattern_Example() {
        // Christmas tree with just one Garland
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        ChristmasTree christmasTreeWithGarland = new GarlandDecorator(christmasTree);
        System.out.println(christmasTreeWithGarland.decorate());

        // Christmas tree with two Garlands and one Bubble lights
        ChristmasTree christmasTreeWithTwoGarlands = new GarlandDecorator(christmasTreeWithGarland);
        ChristmasTree christmasTreeWithTwoGarlandsAndOneBubbleLights = new BubbleLightsDecorator(christmasTreeWithTwoGarlands);
        System.out.println(christmasTreeWithTwoGarlandsAndOneBubbleLights.decorate());
    }

}
