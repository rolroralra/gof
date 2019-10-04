package creational.factory.vo;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println(this.colorType() + "::fill() method called!");
	}

}
