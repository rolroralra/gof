package test.battle.player;

import test.battle.Unit;
import test.battle.skin.Skin;

public class Player extends Unit {

	public Player(Skin skin, int stamina) {
		super(skin, stamina);
	}

	@Override
	public String getName() {
		return "Player";
	}

}
