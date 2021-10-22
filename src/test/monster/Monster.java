package test.monster;

import test.monster.decorator.BaseAttackElementImpl;
import test.monster.decorator.AttackElement;
import test.monster.factory.AbstractElementFactory;

public class Monster {
	
	private AttackElement attackElement;
	private AbstractElementFactory factory;
	
	public Monster(AbstractElementFactory factory) {
		this.factory = factory;
		initElement();
	}
	
	public void initElement() {
		this.attackElement = new BaseAttackElementImpl();
	}
	
	public void setFactory(AbstractElementFactory factory) {
		this.factory = factory;
	}
	
	public void imbue() {
		this.attackElement = factory.getElement(attackElement);
	}
	
	public void attack() {
		this.attackElement.attack();
	}

}
