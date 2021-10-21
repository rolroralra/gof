package behavioral.visitor.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.UUID;

public class VisitorDemo {

    @Test
    public void test_Visitor_Pattern_Example() {

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.addElement(new JsonElement(generateUuid(), "{name:\"rolroralra\", id: 1002}"));
        d.addElement(new JsonElement(generateUuid(), "{name:\"admin\", id: 9999}"));
        d.addElement(new XmlElement(generateUuid(), "input", new HashMap<String, String>(){{
            put("name", "rolroralra");
            put("type", "text");
            put("class", "input");
            put("value", "");
        }}));
        d.addElement(new JsonElement(generateUuid()));
        d.addElement(new XmlElement(generateUuid(), "br"));


        d.accept(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
            .toString();
    }
}