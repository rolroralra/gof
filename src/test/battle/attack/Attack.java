package test.battle.attack;

public abstract class Attack {
	private int attackPower;

	public Attack(int power) {
		this.attackPower = power;
	}
	
	public int getAttackPower() {
		return this.attackPower;
	}

	public abstract String getAttackType();
}
