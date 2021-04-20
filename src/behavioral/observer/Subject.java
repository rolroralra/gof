package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean isChanged = false;

    public void addObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index == -1) {
            observers.add(observer);
        }
    }
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }
    public void notifyObservers(Object ...args) {
        if (isChanged) {
            observers.forEach(observer -> observer.update(this, args));
            isChanged = false;
        }
    }

    public void setChanged() {
        this.isChanged = true;
    }
}
