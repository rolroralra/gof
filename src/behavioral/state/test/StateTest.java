package behavioral.state.test;

import behavioral.state.impl.Context;
import behavioral.state.impl.State;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context(State.STATE02);
        context.execute01();
        context.execute02();
        context.execute03();
        context.execute04();
        context.execute01();
    }
}
