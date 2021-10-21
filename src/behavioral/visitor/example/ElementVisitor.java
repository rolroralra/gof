package behavioral.visitor.example;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
        System.out.println(xe);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with uuid: " + je.uuid);
        System.out.println(je);
    }
}