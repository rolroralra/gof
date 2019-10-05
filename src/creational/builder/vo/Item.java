package creational.builder.vo;

public interface Item {
    default String name() { return this.getClass().getSimpleName(); }
    float price();

    // Bridge Pattern (Decouple Functionality Item and Packing)
    Packing packing();

    default String description() {
        return new StringBuilder()
                    .append("Item: ").append(this.name())
                    .append(", Packing:").append(this.packing().getClass().getSimpleName())
                    .append(", Price:").append(this.price())
                .toString();
    }
}
