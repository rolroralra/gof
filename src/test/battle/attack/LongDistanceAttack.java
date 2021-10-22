package test.battle.attack;

public class LongDistanceAttack extends Attack {

	public LongDistanceAttack(int power) {
		super(power);
	}
	
	@Override
	public String getAttackType() {
		return "원거리 공격";
	}

}
