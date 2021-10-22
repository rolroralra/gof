package test.magic;

import java.util.ArrayList;
import java.util.List;

public class WolfGroup implements Monster {
	private List<Wolf> gr = new ArrayList<>();
	
	
	public void addWolf(Wolf wolf) {
		gr.add(wolf);
	}
	
	@Override
	public void attack(Magic magic) {
		magic.visit(this);
		
		for(Wolf wolf : gr) {
			wolf.attack(magic);
		}
	}

}
