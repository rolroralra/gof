package behavioral.observer.impl;

import java.util.Observable;

public class SubjectImpl<T> extends Observable {
    private T data;

    public SubjectImpl(T data) {
        this.data = data;
    }

    public void set(T data) {
        this.data = data;
        this.setChanged();
        this.notifyObservers(data);
    }
}
