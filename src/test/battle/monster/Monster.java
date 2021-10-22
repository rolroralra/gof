package test.battle.monster;

import test.battle.Unit;
import test.battle.skin.Skin;

public abstract class Monster extends Unit {

	public Monster(Skin skin, int stamina) {
		super(skin, stamina);
	}
}
