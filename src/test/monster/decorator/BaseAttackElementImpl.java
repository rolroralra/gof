package test.monster.decorator;

public class BaseAttackElementImpl implements AttackElement {
	private final int attackPower = 20;
	
	@Override
	public int calculateAttackPower() {
		return this.attackPower;
	}
	
	public void attack() {
		System.out.println("Monster Attacks");
		System.out.println("Attack Power : " + this.calculateAttackPower());
	}
}
