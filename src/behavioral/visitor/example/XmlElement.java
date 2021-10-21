package behavioral.visitor.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class XmlElement extends Element {
    private final Map<String, String> xmlAttributeMap;

    public XmlElement(String uuid, String name) {
        this(uuid, name, new HashMap<>());
    }

    public XmlElement(String uuid, String name, Map<String, String> xmlAttributeMap) {
        super(uuid);
        this.setName(name);
        this.xmlAttributeMap = xmlAttributeMap;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void putAttribute(String name, String value) {
        xmlAttributeMap.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getXmlElementName());
        for (String name : xmlAttributeMap.keySet()) {
            sb.append(" ").append(name).append("=\"").append(xmlAttributeMap.get(name)).append("\"");
        }

        if (xmlAttributeMap.isEmpty()) {
            sb.append("/");
        }
        else {
            sb.append(">").append("</").append(getXmlElementName());
        }
        sb.append(">");
        return sb.toString();
    }

    private String getXmlElementName() {
        return Objects.isNull(getName()) ? "" : getName();
    }
}