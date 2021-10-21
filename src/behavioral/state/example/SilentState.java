package behavioral.state.example;

public class SilentState extends AlertState {
    @Override
    public void alert() {
        System.out.printf("[%s] ......%n",this.getClass().getSimpleName());
    }

    @Override
    public AlertState nextState() {
        return new BellState();
    }
}
