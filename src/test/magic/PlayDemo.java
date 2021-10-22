package test.magic;

public class PlayDemo {

	public static void main(String[] args) {
		Magic blind = new BlindMagic();
		Magic frozen = new FrozenMagic();
		
		Monster giant = new Giant();
		Monster dragon = new Dragon();
		WolfGroup wolfGroup = new WolfGroup();
		wolfGroup.addWolf(new Wolf());
		wolfGroup.addWolf(new Wolf());
		wolfGroup.addWolf(new Wolf());
		
		giant.attack(blind);
		dragon.attack(frozen);
		wolfGroup.attack(frozen);
	}

}
