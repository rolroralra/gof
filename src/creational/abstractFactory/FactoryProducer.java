package creational.abstractFactory;

import creational.abstractFactory.impl.ColorFactoryImpl;
import creational.abstractFactory.impl.ShapeFactoryImpl;
import lombok.Getter;

import java.util.Arrays;

public class FactoryProducer {
	/* LazyHolder Singleton Pattern */
	private static class LazyHolder {
		private static final FactoryProducer INSTANCE = new FactoryProducer();
	}
	
	private FactoryProducer() { }
	
	public static FactoryProducer getInstance() {
		return FactoryProducer.LazyHolder.INSTANCE;
	}
	
	private enum FactoryType {
		SHAPE(ShapeFactoryImpl.class),
//		DUMMY(ShapeFactoryImpl.class),
		COLOR(ColorFactoryImpl.class);
		
		@Getter
		private final Class<?> factoryClazz;
		
		FactoryType(Class<?> clazz) {
			this.factoryClazz = clazz;
		}
	}

	public AbstractFactory getFactory(String factoryType) {
		AbstractFactory result = null;
		try {
			result = (AbstractFactory) Arrays.stream(FactoryType.values())
					.filter(type -> factoryType.equalsIgnoreCase(type.name()))
					.findFirst().get().getFactoryClazz().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		return result;


//		for (FactoryType type: FactoryType.values()) {
//			if (type.name().equalsIgnoreCase(factoryType)) {
//				try {
//					return (AbstractFactory) type.getFactoryClazz().newInstance();
//				} catch (InstantiationException e) {
//					e.printStackTrace();
//				} catch (IllegalAccessException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		return null;
	}


}
