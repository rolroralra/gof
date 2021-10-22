package test.magic;

public class FrozenMagic implements Magic {

	@Override
	public void visit(Giant giant) {
		System.out.println("거인이 얼어붙었습니다.");
	}

	@Override
	public void visit(Dragon dragon) {
		System.out.println("용은 냉기마법에 면역입니다.");
	}

	@Override
	public void visit(Wolf wolf) {
		System.out.println("늑대가 얼어붙었습니다.");
	}

	@Override
	public void visit(WolfGroup wolfGroup) {
		System.out.println("늑대무리에게 냉기마법을 시전합니다.");
	}

}
