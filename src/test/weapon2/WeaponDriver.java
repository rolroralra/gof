package test.weapon2;

import org.junit.jupiter.api.Test;
import test.weapon2.impl.Spear;
import test.weapon2.impl.Sword;
import test.weapon2.magic.LifeStealWeapon;

public class WeaponDriver {

    @Test
    void test_Weapon() {
        Weapon sword = new LifeStealWeapon(new Sword());
        Weapon spear = new LifeStealWeapon(new Spear());

        sword.equipment();
        sword.attack();

        spear.equipment();
        spear.attack();

    }
}
