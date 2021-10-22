package test.magic;

public class Giant implements Monster {

	@Override
	public void attack(Magic magic) {
		magic.visit(this);
	}

}
