package behavioral.state.example;

public class VibrationState extends AlertState {
    @Override
    public void alert() {
        // Do Something
        System.out.printf("[%s] brrrrrrrbrrrrrbrrrrr~%n",this.getClass().getSimpleName());
    }

    @Override
    public AlertState nextState() {
        return new SilentState();
    }
}
