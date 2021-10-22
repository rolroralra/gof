package test.magic;

public class Dragon implements Monster {


	@Override
	public void attack(Magic magic) {
		magic.visit(this);
	}

}
