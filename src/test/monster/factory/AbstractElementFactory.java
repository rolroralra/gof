package test.monster.factory;

import test.monster.decorator.AttackElement;

public abstract class AbstractElementFactory {
	public abstract AttackElement getElement(AttackElement ele);
}
