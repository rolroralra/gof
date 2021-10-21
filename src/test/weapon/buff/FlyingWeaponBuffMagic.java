package test.weapon.buff;

import test.weapon.WeaponBuffMagic;

public class FlyingWeaponBuffMagic implements WeaponBuffMagic {
    @Override
    public void activate() {
        System.out.println("몸이 날아오릅니다.");
    }
}
