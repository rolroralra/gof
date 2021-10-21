package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.magic.LifeStealWeaponBuffMagic;

public class WeaponDriver {
    @Test
    void test() {
        Weapon sword = new Sword();
        sword.equip();
        sword.attack();

        sword.setWeaponBuffMagicVisitor(new LifeStealWeaponBuffMagic());
        sword.equip();
        sword.attack();
    }
}
