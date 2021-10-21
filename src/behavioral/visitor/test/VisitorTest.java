package behavioral.visitor.test;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;
import behavioral.visitor.impl.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class VisitorTest {

    @Test
    void test_Visitor_Pattern() {
        ComputerPart keyBoard = new KeyBoard();
        ComputerPart mouse = new Mouse();
        ComputerPart monitor = new Monitor();
        ComputerPart computer = new Computer(Arrays.asList(keyBoard, mouse, monitor));

        ComputerPartVisitor computerPartVisitor = new ComputerPartVisitorImpl();

        computer.accept(computerPartVisitor);
    }
}
