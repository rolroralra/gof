package test.weapon.buff;

import test.weapon.WeaponBuffMagic;

public class LifeStealWeaponBuffMagic implements WeaponBuffMagic {
    @Override
    public void activate() {
        System.out.println("피가 고프네요....");
    }
}
