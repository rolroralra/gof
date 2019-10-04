package creational.factory.vo;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(this.getClass().getSimpleName() + "::draw() method called!");
	}

}
