package test.battle;


import test.battle.attack.LongDistanceAttack;
import test.battle.attack.MagicAttack;
import test.battle.attack.ShortDistanceAttack;
import test.battle.monster.dragon.Dragon;
import test.battle.player.Player;
import test.battle.skin.BlackSkin;
import test.battle.skin.GoldSkin;
import test.battle.skin.PlayerSkin;
import test.battle.skin.RedSkin;

public class TestBattle {
	public static void main(String[] args) {
		Unit dragon1 = new Dragon(new RedSkin(), 10);
		dragon1.addDepenseAbility(new ShortDistanceAttack(10));
		dragon1.addDepenseAbility(new LongDistanceAttack(10));
		
		Unit dragon2 = new Dragon(new BlackSkin(), 10);
		dragon2.addDepenseAbility(new ShortDistanceAttack(7));
		dragon2.addDepenseAbility(new MagicAttack(10));
		
		Unit dragon3 = new Dragon(new GoldSkin(), 15);
		dragon3.addDepenseAbility(new ShortDistanceAttack(10));
		dragon3.addDepenseAbility(new LongDistanceAttack(15));
		dragon3.addDepenseAbility(new MagicAttack(1));
		
		Unit player = new Player(new PlayerSkin(), 10);
		
		dragon1.show();
		player.setAttackStrategy(new MagicAttack(5));
		player.attack(dragon1);
		player.setAttackStrategy(new LongDistanceAttack(5));
		player.attack(dragon1);
		
		dragon2.show();
		player.setAttackStrategy(new ShortDistanceAttack(5));
		player.attack(dragon2);		
		player.setAttackStrategy(new MagicAttack(5));
		player.attack(dragon2);
		player.setAttackStrategy(new LongDistanceAttack(10));
		player.attack(dragon2);

		dragon3.show();
		player.setAttackStrategy(new ShortDistanceAttack(5));
		player.attack(dragon3);		
		player.setAttackStrategy(new LongDistanceAttack(10));
		player.attack(dragon3);
		player.setAttackStrategy(new MagicAttack(10));
		player.attack(dragon3);

	}
}
