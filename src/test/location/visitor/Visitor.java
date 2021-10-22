package test.location.visitor;

import test.location.location.Castle;
import test.location.location.Cave;
import test.location.location.Town;

public interface Visitor {
    void visit(Town town);
    void visit(Castle castle);
    void visit(Cave cave);
}
