package test.monster.decorator;

public class WindAttackElement extends AttackElementDecorator {

	private final int additionalAttackPower = 7;
	
	public WindAttackElement(AttackElement ele) {
		super(ele);
	}

	@Override
	public int calculateAttackPower() {
		int rtn = super.calculateAttackPower() + additionalAttackPower;
		System.out.println("바람의 힘! +" + additionalAttackPower);
		return rtn;
	}
	
	public void attack() {
		super.attack();
	}
}
