package behavioral.state.impl;

import behavioral.state.StateInterface;

public enum State implements StateInterface {
    STATE01{
        @Override
        public void execute01(Context context) {
            System.out.println(this + "... execute01()");
            context.setState(STATE02);
        }
    },
    STATE02 {
        @Override
        public void execute02(Context context) {
            System.out.println(this + "... execute02()");
            context.setState(STATE03);
        }

        @Override
        public void execute04(Context context) {
            System.out.println(this + "... execute04()");
            context.setState(STATE01);
        }
    },
    STATE03{
        @Override
        public void execute03(Context context) {
            System.out.println(this + "... execute03()");
            context.setState(STATE02);
        }
    };

    public static State getDefaultState() {
        return State.STATE01;
    }
}
