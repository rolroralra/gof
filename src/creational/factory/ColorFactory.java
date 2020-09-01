package creational.factory;

import creational.factory.vo.Blue;
import creational.factory.vo.Color;
import creational.factory.vo.Green;
import creational.factory.vo.Red;
import lombok.Getter;

public class ColorFactory {
	private enum ColorType {
		RED(Red.class),
		GREEN(Green.class),
		BLUE(Blue.class);
		
		@Getter
		private final Class<?> colorClazz;
		
		ColorType(Class<?> colorClazz) {
			this.colorClazz = colorClazz;
		}
	}
	
	public Color getColor(String colorType) throws InstantiationException, IllegalAccessException {
		for (ColorType type : ColorType.values()) {
			if (type.colorClazz.getSimpleName().equalsIgnoreCase(colorType)) {
				return (Color) type.colorClazz.newInstance();
			}
		}
		
		return null;
	}
}
