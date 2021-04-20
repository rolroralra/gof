package behavioral.observer.impl;

import java.util.Observable;
import java.util.Observer;

public class ObserverImpl<T> implements Observer {
    private T data;

    @Override
    public void update(Observable o, Object arg) {
        this.data = (T) arg;

        System.out.println(this + " --> " + data);
    }
}
