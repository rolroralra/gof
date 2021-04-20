package behavioral.observer.impl;

import behavioral.observer.Observer;
import behavioral.observer.Subject;

public class ObserverImpl2<T> implements Observer {
    T data;

    @SuppressWarnings("unchecked")
    @Override
    public void update(Subject subject, Object... args) {
        if (args.length > 0) {
            this.data = (T)args[0];
        }

        System.out.println("Subject : " + subject);
        System.out.println("Observer : " + this);
        System.out.println("Data : " + this.data);
    }
}
