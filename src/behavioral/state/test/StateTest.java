package behavioral.state.test;

import behavioral.state.impl.Context;
import behavioral.state.impl.State;
import org.junit.jupiter.api.Test;

public class StateTest {
    @Test
    void test_State_Pattern() {
//        Context defaultContext = new Context();
        Context context = new Context(State.STATE02);
        context.execute01();
        context.execute02();
        context.execute03();
        context.execute04();
        context.execute01();
    }
}
