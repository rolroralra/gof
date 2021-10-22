package test.magic;

public class Wolf implements Monster {

	@Override
	public void attack(Magic magic) {
		magic.visit(this);
	}

}
