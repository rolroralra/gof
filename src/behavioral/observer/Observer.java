package behavioral.observer;

public interface Observer {
    void update(Subject subject, Object ...args);
}
