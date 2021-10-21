package test.weapon.buff;

import test.weapon.WeaponBuffMagic;

public class NullWeaponBuffMagic implements WeaponBuffMagic {
    @Override
    public void activate() {
        // Do Nothing
        System.out.println("아무일도 일어나지 않았습니다.");
    }
}
