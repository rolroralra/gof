package test.monster.factory;

import java.util.Random;

import test.monster.decorator.EarthAttackElement;
import test.monster.decorator.FireAttackElement;
import test.monster.decorator.AttackElement;
import test.monster.decorator.WaterAttackElement;
import test.monster.decorator.WindAttackElement;

public class RandomElementFactory extends AbstractElementFactory{
	
	private final int MAX_ELEMENT_CNT = 5;
	
	private int getElementCount() {
		return new Random().nextInt(MAX_ELEMENT_CNT);
	}
	
	public AttackElement getElement(AttackElement ele) {
		
		AttackElement rtnAttackElement = ele;
		
		int elementCount = getElementCount(); 
		int mode;
		for(int i = 0; i < elementCount; i++) {	
			mode = new Random().nextInt(4);
			switch(mode) {
			case 0 : 
				rtnAttackElement =  new FireAttackElement(rtnAttackElement);
				break;
			case 1 : 
				rtnAttackElement = new WindAttackElement(rtnAttackElement);
				break;
			case 2 : 
				rtnAttackElement =  new WaterAttackElement(rtnAttackElement);
				break;
			case 3 : 
				rtnAttackElement = new EarthAttackElement(rtnAttackElement);
				break;
			default :
				rtnAttackElement = new FireAttackElement(rtnAttackElement);
				break;
			}
		}
		return rtnAttackElement;
	}
}
