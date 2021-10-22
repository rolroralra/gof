package test.potion.command;

import test.potion.receiver.Player;

public class HealMediumPotionCommand implements PotionCommand {

	private final int healAmount = 20;
	private final String name = "회복" + healAmount;
	private final Player player;
	
	public HealMediumPotionCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void use() {
		player.tryHeal(healAmount);
	}

	@Override
	public String getName() {
		return name;
	}
}
