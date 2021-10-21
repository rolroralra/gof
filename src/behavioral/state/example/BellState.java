package behavioral.state.example;

public class BellState extends AlertState {
    @Override
    public void alert() {
        // Do Something
        System.out.printf("[%s] 따르릉 따르릉~%n",this.getClass().getSimpleName());
    }

    @Override
    public AlertState nextState() {
        return new VibrationState();
    }


}
