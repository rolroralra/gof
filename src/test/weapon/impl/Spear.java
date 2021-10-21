package test.weapon.impl;

import test.weapon.Weapon;
import test.weapon.WeaponBuffMagic;

public class Spear extends Weapon {
    public Spear(WeaponBuffMagic weaponBuffMagic) {
        super(weaponBuffMagic);
    }

    @Override
    public void equip() {
        System.out.println(this.getClass().getSimpleName() + "을 장비했습니다.");
        weaponBuffMagic.activate();
    }

    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName() + "을 찔렀습니다.");
        weaponBuffMagic.activate();
    }
}
