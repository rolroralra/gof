package creational.factory;

import lombok.Getter;

public class FactoryProducer {
	private static class LazyHolder {
		private static final FactoryProducer INSTANCE = new FactoryProducer();
	}
	
	private FactoryProducer() { }
	
	public static FactoryProducer getInstance() {
		return FactoryProducer.LazyHolder.INSTANCE;
	}
	
	private enum FactoryType {
		SHAPE(ShapeFactory.class),
		COLOR(ColorFactory.class);
		
		@Getter
		private final Class<?> clazz;
		
		private FactoryType(Class<?> clazz) {
			this.clazz = clazz;
		}
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getFactory(String factoryType) 
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		for (FactoryType type: FactoryType.values()) {
			if (type.name().equalsIgnoreCase(factoryType)) {
				return (T) type.getClazz().newInstance();
			}
		}
		
		return null;
	}
}
