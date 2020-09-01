package creational.factory;

import creational.factory.vo.Circle;
import creational.factory.vo.Rectangle;
import creational.factory.vo.Shape;
import creational.factory.vo.Square;
import lombok.Getter;

public class ShapeFactory {
	
	private enum ShapeType {
		CIRCLE(Circle.class),
		RECTANGLE(Rectangle.class),
		SQUARE(Square.class);
		
		@Getter
		final private Class<?> clazz;
		
		ShapeType(Class<?> shapeClass) {
			this.clazz = shapeClass;
		}
	}
	
	public Shape getShape(String shapeType) {
		for (ShapeType type : ShapeType.values()) {
			if (type.getClazz().getSimpleName().equalsIgnoreCase(shapeType)) {
				try {
					return (Shape) type.getClazz().newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} 
			}
		}
		
		return null;
	}
}
