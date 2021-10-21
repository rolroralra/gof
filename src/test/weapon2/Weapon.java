package test.weapon2;

public interface Weapon {
    default void equipment() {
        System.out.println(this.getClass().getSimpleName() + "을 장비했습니다.");
    }

    void attack();
}
