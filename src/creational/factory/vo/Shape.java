package creational.factory.vo;

public interface Shape {
	default void draw() {
		System.out.println(this.getClass().getSimpleName() + "::draw() default method called!");
	}
}
