package behavioral.visitor.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonElement extends Element {
    private JsonObject jsonObject = new JsonObject();

    public JsonElement(String uuid) {
        super(uuid);
    }

    public JsonElement(String uuid, String jsonString) {
        this(uuid, JsonParser.parseString(jsonString).getAsJsonObject());
    }

    public JsonElement(String uuid, JsonObject jsonObject) {
        super(uuid);
        this.jsonObject = jsonObject;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void put(String name, Object value) {


        jsonObject.add(name, new Gson().toJsonTree(value, value.getClass()));
    }

    @Override
    public String toString() {
        return jsonObject.toString();
    }
}