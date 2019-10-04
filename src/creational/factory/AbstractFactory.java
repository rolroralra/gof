package creational.factory;

import creational.factory.vo.Color;
import creational.factory.vo.Shape;

public abstract class AbstractFactory {
	abstract public Shape getShape(String shapeType);
	
	abstract public Color getColor(String colorType);
}
