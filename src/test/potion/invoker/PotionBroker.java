package test.potion.invoker;

import java.util.ArrayList;
import java.util.List;

import test.potion.command.PotionCommand;

public class PotionBroker {
	private final List<PotionCommand> potions = new ArrayList<>();
	
	public void addPotion(PotionCommand command) {
		if(potions.size() > 9) {
			System.out.println("포션가방이 가득찼습니다. " + command.getName());
			return;
		}
		this.potions.add(command);
	}
	
	public void getPotions() {
		System.out.println("소유한 포션 목록:");
		for(int i = 0; i < potions.size(); i++) {
			System.out.println(i + " : " + potions.get(i).getName());
		}
	}
	
	public void drink(int index) {
		PotionCommand potionCommand = potions.get(index);
		potionCommand.use();
		potions.remove(potionCommand);
	}
}
