package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.client.Player;
import test.weapon3.magic.WeaponBuffMagic;

public class WeaponDriver {
    @Test
    void test() {
        Player player = new Player();
        player.setWeapon(new Sword());
        testPlayerEquipWithAllBuffMagic(player);

        player.setWeapon(new Spear());
        testPlayerEquipWithAllBuffMagic(player);

        Weapon sword = new Sword();
        testWeaponsWithAllBuffMagic(sword);
        System.out.println();

        Weapon spear = new Spear();
        testWeaponsWithAllBuffMagic(spear);
    }

    private void testPlayerAttackWithBuffMagic(Player player, WeaponBuffMagic weaponBuffMagic) {
        player.setWeaponBuffMagic(weaponBuffMagic);
        player.equip();
        player.attack();
    }

    private void testPlayerEquipWithAllBuffMagic(Player player) {
        for (WeaponBuffMagic weaponBuffMagic : WeaponBuffMagic.values()) {
            System.out.printf("[%s %s TEST]%n", player, weaponBuffMagic);
            testPlayerAttackWithBuffMagic(player, weaponBuffMagic);
            System.out.println();
        }
    }

    private void testWeaponsWithAllBuffMagic(Weapon weapon) {
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
