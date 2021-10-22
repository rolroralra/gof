package creational.singleton;

public class SingleTon {
    private static final SingleTon INSTANCE = new SingleTon();

    private SingleTon() { }

    public static SingleTon getInstance() {
        return SingleTon.INSTANCE;
    }
}
