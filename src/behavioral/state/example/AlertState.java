package behavioral.state.example;

public abstract class AlertState {
    public abstract void alert();
    public abstract AlertState nextState();
}
