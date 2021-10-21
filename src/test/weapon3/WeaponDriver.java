package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.magic.WeaponBuffMagic;

import java.util.Arrays;

public class WeaponDriver {
    @Test
    void test() {
        Weapon sword = new Sword();
        Arrays.stream(WeaponBuffMagic.values()).forEach(weaponBuffMagic -> {
            sword.setWeaponBuffMagicVisitor(weaponBuffMagic);
            sword.equip();
            sword.attack();
            System.out.println();
        });
        System.out.println();

        Weapon spear = new Spear();
        Arrays.stream(WeaponBuffMagic.values()).forEach(weaponBuffMagic -> {
            spear.setWeaponBuffMagicVisitor(weaponBuffMagic);
            spear.equip();
            spear.attack();
            System.out.println();
        });
    }
}
