package behavioral.visitor.impl;

import behavioral.visitor.ComputerPartVisitor;
import behavioral.visitor.ComputerPart;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
