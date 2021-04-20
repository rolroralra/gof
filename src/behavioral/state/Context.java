package behavioral.state.impl;

import behavioral.state.Behavior;
import lombok.Getter;
import lombok.Setter;

public class Context implements Behavior {
    @Getter
    @Setter
    State state;

    public Context() {
        this(State.getDefaultState());
    }

    public Context(State state) {
        this.state = state;
    }

    @Override
    public void execute01() {
        this.state.execute01(this);
    }

    @Override
    public void execute02() {
        this.state.execute02(this);
    }

    @Override
    public void execute03() {
        this.state.execute03(this);
    }

    @Override
    public void execute04() {
        this.state.execute04(this);
    }
}
