package test.potion.command;

import test.potion.receiver.Player;

public class HealSmallPotionCommand implements PotionCommand {

	private final int healAmount = 10;
	private final String name = "회복" + healAmount;
	private final Player player;
	
	public HealSmallPotionCommand(Player player) {
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
