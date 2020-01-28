package creational.builder.vo;

public class Wrapper implements Packing {
    @Override
    public void pack() {
        System.out.println(this.getClass().getSimpleName() + "::pack() method called!");
    }
}
