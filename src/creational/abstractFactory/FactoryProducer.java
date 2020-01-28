package creational.abstractFactory;

import creational.abstractFactory.impl.ColorFactoryImpl;
import creational.abstractFactory.impl.ShapeFactoryImpl;
import lombok.Getter;

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
		COLOR(ColorFactoryImpl.class);
		
		@Getter
		private final Class<?> factoryClazz;
		
		private FactoryType(Class<?> clazz) {
			this.factoryClazz = clazz;
		}
	}

	public AbstractFactory getFactory(String factoryType) {
		for (FactoryType type: FactoryType.values()) {
			if (type.name().equalsIgnoreCase(factoryType)) {
				try {
					return (AbstractFactory) type.getFactoryClazz().newInstance();
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
