package creational.factory.test;

import creational.factory.ColorFactory;
import creational.abstractFactory.FactoryProducer;
import creational.factory.ShapeFactory;
import creational.factory.vo.Color;
import creational.factory.vo.Shape;

public class MainFactory {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// Factory Pattern Test 1
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape("circle");
		Shape rectangle = shapeFactory.getShape("Rectangle");
		Shape square = shapeFactory.getShape("square");
		
		circle.draw();
		rectangle.draw();
		square.draw();

		
		// Factory Pattern Test 2
		ColorFactory colorFactory = new ColorFactory();
		
		Color red = colorFactory.getColor("RED");
		Color green = colorFactory.getColor("Green");
		Color blue = colorFactory.getColor("BLue");
	
		red.fill();
		green.fill();
		blue.fill();

	}
}
