package test.weapon3.weapon;

import lombok.Getter;
import lombok.Setter;

public abstract class Weapon {
    @Getter
    @Setter
    private int power;

    public Weapon() {
        this.power = 0;
    }

    public void attack() {
        System.out.println(this.getClass().getSimpleName() + "를 휘둘렀습니다.");
    }

    public void equip() {
        System.out.println(this.getClass().getSimpleName() + "를 장비했습니다.");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
