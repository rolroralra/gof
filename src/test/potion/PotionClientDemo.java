package test.potion;

import org.junit.jupiter.api.Test;
import test.potion.command.DetoxPotionCommand;
import test.potion.command.HealSmallPotionCommand;
import test.potion.command.HealMediumPotionCommand;
import test.potion.invoker.PotionBroker;
import test.potion.receiver.Player;

public class PotionClientDemo {
	@Test
	public void test() {
		Player player = new Player();
		
		PotionBroker potionBroker = new PotionBroker();
		potionBroker.addPotion(new HealSmallPotionCommand(player));
		potionBroker.addPotion(new HealMediumPotionCommand(player));
		potionBroker.addPotion(new DetoxPotionCommand(player));
		potionBroker.addPotion(new DetoxPotionCommand(player));
		
		potionBroker.getPotions();
		potionBroker.drink(1);		
		
		potionBroker.getPotions();
		potionBroker.drink(1);
		
		potionBroker.getPotions();
		potionBroker.drink(1);
		
		potionBroker.getPotions();
		potionBroker.drink(0);
	}
}
