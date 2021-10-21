package behavioral.visitor.example;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
