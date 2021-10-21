package test.weapon;

import org.junit.jupiter.api.Test;
import test.weapon.buff.FlyingWeaponBuffMagic;
import test.weapon.buff.LifeStealWeaponBuffMagic;
import test.weapon.buff.LightWeaponBuffMagic;
import test.weapon.buff.NullWeaponBuffMagic;
import test.weapon.impl.Spear;
import test.weapon.impl.Sword;


public class WeaponDriver {

    @Test
    void test() {
        // Spear Test
        System.out.println("[Spear Test]");
        testWeapon(new Spear(new FlyingWeaponBuffMagic()));
        testWeapon(new Spear(new LightWeaponBuffMagic()));
        testWeapon(new Spear(new NullWeaponBuffMagic()));
        testWeapon(new Spear(new LifeStealWeaponBuffMagic()));
        System.out.println();


        // Sword Test
        System.out.println("[Sword Test]");
        testWeapon(new Sword(new FlyingWeaponBuffMagic()));
        testWeapon(new Sword(new LightWeaponBuffMagic()));
        testWeapon(new Sword(new NullWeaponBuffMagic()));
        testWeapon(new Sword(new LifeStealWeaponBuffMagic()));
        System.out.println();

    }

    private void testWeapon(Weapon weapon) {
        weapon.equip();
        weapon.attack();
    }
}
