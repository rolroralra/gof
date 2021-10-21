package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.magic.LifeStealWeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagic;

public class WeaponDriver {
    @Test
    void test() {
        Weapon sword = new Sword();
        sword.equip();
        sword.attack();

//        sword.setWeaponBuffMagicVisitor(new LifeStealWeaponBuffMagic());
        sword.setWeaponBuffMagicVisitor(WeaponBuffMagic.FLYING);
        sword.equip();
        sword.attack();

        sword.setWeaponBuffMagicVisitor(WeaponBuffMagic.LIFE_STEAL);
        sword.equip();
        sword.attack();

        sword.setWeaponBuffMagicVisitor(WeaponBuffMagic.LIGHT);
        sword.equip();
        sword.attack();
    }
}
