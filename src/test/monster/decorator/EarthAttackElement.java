package test.monster.decorator;

public class EarthAttackElement extends AttackElementDecorator {

	private final int additionalAttackPower = 8;
	
	public EarthAttackElement(AttackElement ele) {
		super(ele);
	}

	@Override
	public int calculateAttackPower() {
		int rtn = super.calculateAttackPower() + additionalAttackPower;
		System.out.println("대지의 힘! +" + additionalAttackPower);
		return rtn;
	}
	
	public void attack() {
		super.attack();
	}
}
