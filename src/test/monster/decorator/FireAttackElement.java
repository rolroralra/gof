package test.monster.decorator;

public class FireAttackElement extends AttackElementDecorator {

	private final int additionalAttackPower = 6;
	
	public FireAttackElement(AttackElement ele) {
		super(ele);
	}

	@Override
	public int calculateAttackPower() {
		int rtn = super.calculateAttackPower() + additionalAttackPower;
		System.out.println("불의 힘! +" + additionalAttackPower);
		return rtn;
	}
	
	public void attack() {
		super.attack();
	}
}
