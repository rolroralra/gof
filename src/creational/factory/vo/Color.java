package creational.factory.vo;

public interface Color {
	default String colorType() {
		return this.getClass().getSimpleName();
	}
	
	default void fill() {
		System.out.println(this.getClass().getSimpleName() + "::fill() default method called!");
	}
}
