package test.magic;

public class BlindMagic implements Magic {

	@Override
	public void visit(Giant giant) {
		System.out.println("거인의 눈이 멀었습니다.");
	}

	@Override
	public void visit(Dragon dragon) {
		System.out.println("용의 눈이 멀었습니다.");
	}

	@Override
	public void visit(Wolf wolf) {
		System.out.println("늑대의 눈이 멀었지만, 냄새를 맡습니다.");
	}

	@Override
	public void visit(WolfGroup wolfGroup) {
		System.out.println("늑대무리에게 눈멀기 마법을 시전합니다.");
	}

}
