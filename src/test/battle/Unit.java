package test.battle;


import java.util.HashMap;
import java.util.Map;

import test.battle.attack.Attack;
import test.battle.skin.Skin;

public abstract class Unit {
	
	protected Skin skin;
	protected int stamina;
	protected Attack attackAbility;
	protected Map<String, Integer> defenceAbilities;
		
	public Unit(Skin skin, int stamina) {
		this.skin = skin;
		this.stamina = stamina;
		this.defenceAbilities = new HashMap<>();
	}

	public void show() {
		System.out.println(this.getName() + "이 등장합니다. 현재 체력: " + this.stamina);
	}	
	
	public abstract String getName();
	
	public void addDepenseAbility(Attack attack) {
		defenceAbilities.put(attack.getAttackType(), attack.getAttackPower());
	}
	
	public void beAttacted(Attack attack) {

		if(this.stamina <= 0) {
			System.out.println(this.getName() + "가 이미 죽은 상태입니다.");
			return;
		}

		String attackType = attack.getAttackType();
		
		int depensePower = 0;
		if(defenceAbilities.containsKey(attackType)) {
			depensePower = defenceAbilities.get(attackType);
		}		
		int demage = attack.getAttackPower() - depensePower;
		if(demage > 0) {
			stamina -= demage;
			if(stamina < 0) stamina = 0;
			System.out.println(this.getName() + "가 " + demage + " 피해를 입었습니다. 남은 체력: " + this.stamina);
		}else {
			System.out.println(this.getName() + "가 죽었습니다. 남은 체력: " + this.stamina);
		}

		if(stamina <= 0)
			System.out.println(this.getName() + ": 쓰러짐");
		
		System.out.println();

	}

	public void setAttackStrategy(Attack attackAbility) {
		this.attackAbility = attackAbility;		
	}
	
	public void attack(Unit target) {
		System.out.println(target.getName() + "이 " + this.attackAbility.getAttackType() + " 공격합니다. 공격 파워력: " + this.attackAbility.getAttackPower());
		
		target.beAttacted(this.attackAbility);
	}
}
