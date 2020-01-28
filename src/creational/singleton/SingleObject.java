package creational.singleton;

public class SingleObject {
    private static final SingleObject INSTANCE = new SingleObject();

    private SingleObject() { }

    public static SingleObject getInstance() {
        return SingleObject.INSTANCE;
    }
}
