package behavioral.visitor;

import behavioral.visitor.impl.Computer;
import behavioral.visitor.impl.KeyBoard;
import behavioral.visitor.impl.Monitor;
import behavioral.visitor.impl.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
}
