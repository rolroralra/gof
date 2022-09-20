package behavioral.visitor.impl;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
    private final List<ComputerPart> computerPartList;

    public Computer() {
        this(new ArrayList<>());
    }

    public Computer(List<ComputerPart> computerPartList) {
        this.computerPartList = computerPartList;
    }

    public void addComputerPart(ComputerPart computerPart) {
        computerPartList.add(computerPart);
    }

    public void removeComputerPart(ComputerPart computerPart) {
        computerPartList.remove(computerPart);
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerPartList) {
            computerPart.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
