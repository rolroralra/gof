package test.weapon.buff;

import test.weapon.WeaponBuffMagic;

public class LightWeaponBuffMagic implements WeaponBuffMagic {
    @Override
    public void activate() {
        System.out.println("빛을 발합니다.");

    }
}
