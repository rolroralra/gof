package test.battle.monster.dragon;

import test.battle.monster.Monster;
import test.battle.skin.Skin;

public class Dragon extends Monster{
	
	public Dragon(Skin skin, int stamina) {
		super(skin, stamina);
	}
	
	@Override
	public String getName() {
		return this.skin.getColor() + "Dragon";
	}

}
