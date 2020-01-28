package creational.builder.vo;

public interface Packing {
    default void pack() {
        System.out.println(this.getClass().getSimpleName() + "::pack() default method called!");
    }
}
