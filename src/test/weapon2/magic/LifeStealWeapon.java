package test.weapon2.magic;

import test.weapon2.Weapon;
import test.weapon2.WeaponDecorator;

public class LifeStealWeapon extends WeaponDecorator {
    public LifeStealWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void equipment() {
        weapon.equipment();
        System.out.println("피가 먹고싶네요...");
    }

    @Override
    public void attack() {
        weapon.attack();
        System.out.println("피가 흡수되었습니다.");
    }
}
