package test.monster.decorator;

public abstract class AttackElementDecorator implements AttackElement {
	private AttackElement attackElement;
	
	public AttackElementDecorator(AttackElement ele) {
		this.attackElement = ele;
	}
	
	@Override
	public int calculateAttackPower() {
		return attackElement.calculateAttackPower();
	}
	
	public void attack() {
		System.out.println("Monster Attacks");
		System.out.println("Attack Power : " + this.calculateAttackPower());
	}
}
