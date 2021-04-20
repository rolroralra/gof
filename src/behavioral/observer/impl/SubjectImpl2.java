package behavioral.observer.impl;

import behavioral.observer.Subject;

public class SubjectImpl2<T> extends Subject {
    T data;

    public SubjectImpl2(T data) {
        this.data = data;
    }

    public void set(T data) {
        this.data = data;
        this.setChanged();
        this.notifyObservers(data);
    }
}
