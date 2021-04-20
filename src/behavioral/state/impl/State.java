package behavioral.state.impl;

import behavioral.state.StateInterface;

public enum State implements StateInterface {
    STATE01{
        @Override
        public void execute01(Context context) {
            System.out.println("CURRENT STATE : " + context.getState());
            System.out.println("... execute01()");
            context.setState(STATE02);
            context.execute02();
        }
    },
    STATE02 {
        @Override
        public void execute02(Context context) {
            System.out.println("CURRENT STATE : " + context.getState());
            System.out.println("... execute02()");
            context.setState(STATE03);
            context.execute03();
        }

        @Override
        public void execute04(Context context) {
            System.out.println("CURRENT STATE : " + context.getState());
            System.out.println("... execute04()");
            context.setState(STATE01);
            System.out.println("Completed!");
        }
    },
    STATE03{
        @Override
        public void execute03(Context context) {
            System.out.println("CURRENT STATE : " + context.getState());
            System.out.println("... execute03()");
            context.setState(STATE02);
            context.execute04();
        }
    };

    public static State getDefaultState() {
        return State.STATE01;
    }
}
