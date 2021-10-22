package test.location.location;

import test.location.visitor.Visitor;

public class Town extends Location{

	@Override
	public void accept(Visitor v) {
		 v.visit(this);
	}

}
