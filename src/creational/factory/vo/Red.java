package creational.factory.vo;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println(this.getClass().getSimpleName() + "::fill() method called!");
	}

}
