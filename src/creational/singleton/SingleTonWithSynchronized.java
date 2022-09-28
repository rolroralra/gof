package creational.singleton;

import java.util.Objects;

public class SingleTonWithSynchronized {
    private volatile static SingleTonWithSynchronized INSTANCE = null;

    private SingleTonWithSynchronized() {}

    public static SingleTonWithSynchronized getInstance() {
        if (Objects.isNull(INSTANCE)) {
            // static code synchronized
            synchronized (SingleTonWithSynchronized.class) {
                // Double Check
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new SingleTonWithSynchronized();
                }
            }
        }

        return INSTANCE;
    }

    public static SingleTonWithSynchronized getInstance2() {
        if (INSTANCE == null) {
            synchronized (SingleTonWithSynchronized.class) {
                INSTANCE = new SingleTonWithSynchronized();
            }
        }

        return INSTANCE;
    }
}
