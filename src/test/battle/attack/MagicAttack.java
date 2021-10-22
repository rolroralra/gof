package test.battle.attack;

public class MagicAttack extends Attack {

	
	public MagicAttack(int power) {
		super(power);
	}

	@Override
	public String getAttackType() {
		return "마법 공격";
	}
}
