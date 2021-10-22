package test.monster.decorator;

public class WaterAttackElement extends AttackElementDecorator {

	private final int additionalAttackPower = 5;
	
	public WaterAttackElement(AttackElement ele) {
		super(ele);
	}

	@Override
	public int calculateAttackPower() {
		int rtn = super.calculateAttackPower() + additionalAttackPower;
		System.out.println("물의 힘! +" + additionalAttackPower);
		return rtn;
	}
	
	public void attack() {
		super.attack();
	}
}
