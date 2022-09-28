package creational.singleton.enums;

public enum SingleTonWithEnum {
    INSTANCE;

    public static SingleTonWithEnum getInstance() {
        return INSTANCE;
    }
}
