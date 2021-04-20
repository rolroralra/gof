package behavioral.state;

import behavioral.state.impl.Context;

public interface StateInterface {
    default void execute01(Context context) {
        System.out.println("Failed to perform execute01.");
    }

    default void execute02(Context context) {
        System.out.println("Failed to perform execute02.");
    }

    default void execute03(Context context) {
        System.out.println("Failed to perform execute03.");
    }

    default void execute04(Context context) {
        System.out.println("Failed to perform execute04.");
    }

}
