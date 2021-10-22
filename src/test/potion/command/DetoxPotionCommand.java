package test.potion.command;

import test.potion.receiver.Player;

public class DetoxPotionCommand implements PotionCommand {

	private final String name = "해독";
	private final Player player;
	
	public DetoxPotionCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void use() {
		player.tryDetox();
	}

	@Override
	public String getName() {
		return name;
	}

}
