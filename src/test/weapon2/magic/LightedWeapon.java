package test.weapon2.magic;

import test.weapon2.Weapon;
import test.weapon2.WeaponDecorator;

public class LightedWeapon extends WeaponDecorator {
    public LightedWeapon(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void equipment() {
        weapon.equipment();
        System.out.println("빛과 함께라면...");

    }

    @Override
    public void attack() {
        weapon.attack();
        System.out.println("찬란한 빛을 발사합니다.");
    }
}
