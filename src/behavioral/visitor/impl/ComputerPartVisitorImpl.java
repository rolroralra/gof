package behavioral.visitor.impl;

import behavioral.visitor.ComputerPartVisitor;

public class ComputerPartVisitorImpl implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.printf("[%-50s] %s visited.%n", computer, computer.getClass().getSimpleName());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.printf("[%-50s] %s visited.%n", monitor, monitor.getClass().getSimpleName());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.printf("[%-50s] %s visited.%n", mouse, mouse.getClass().getSimpleName());
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.printf("[%-50s] %s visited.%n", keyBoard, keyBoard.getClass().getSimpleName());
    }
}
