package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.magic.WeaponBuffMagic;

public class WeaponDriver {
    @Test
    void test() {
        Weapon sword = new Sword();
        testAllWeaponsWithBuffMagic(sword);
        System.out.println();

        Weapon spear = new Spear();
        testAllWeaponsWithBuffMagic(spear);
    }

    private void testAllWeaponsWithBuffMagic(Weapon weapon) {
        for (WeaponBuffMagic weaponBuffMagic : WeaponBuffMagic.values()) {
            System.out.printf("[%s %s TEST]%n", weapon, weaponBuffMagic);
            testWeaponWithBuffMagic(weapon, weaponBuffMagic);
            System.out.println();
        }
    }

    private void testWeaponWithBuffMagic(Weapon weapon, WeaponBuffMagic weaponBuffMagic) {
        weapon.setWeaponBuffMagicVisitor(weaponBuffMagic);
        weapon.equip();
        weapon.attack();
    }
}
