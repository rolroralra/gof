package test.potion;

import test.potion.command.DetoxPotionCommand;
import test.potion.command.HealSmallPotionCommand;
import test.potion.command.HealMediumPotionCommand;
import test.potion.invoker.PotionBroker;
import test.potion.receiver.Player;

public class PotionClientDemo {
	public static void main(String[] args) {
		Player player = new Player();
		
		PotionBroker potionBroker = new PotionBroker();
		potionBroker.addPotion(new HealSmallPotionCommand(player));
		potionBroker.addPotion(new HealMediumPotionCommand(player));
		potionBroker.addPotion(new DetoxPotionCommand(player));
		potionBroker.addPotion(new DetoxPotionCommand(player));
		
		// ġ��20
		potionBroker.getPotions();		
		potionBroker.drink(1);		
		
		// Detox
		potionBroker.getPotions();		
		potionBroker.drink(1);
		
		// Detox
		potionBroker.getPotions();		
		potionBroker.drink(1);
		
		// ġ��10
		potionBroker.getPotions();
		potionBroker.drink(0);
	}
}
