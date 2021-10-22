package test.battle.attack;

public class ShortDistanceAttack extends Attack {

	public ShortDistanceAttack(int power) {
		super(power);
	}
	
	@Override
	public String getAttackType() {
		return "근접 공격";
	}
}
