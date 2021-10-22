package test.weapon3;

import org.junit.jupiter.api.Test;
import test.weapon3.client.Player;
import test.weapon3.magic.FlyingWeaponBuffMagic;
import test.weapon3.magic.LifeStealWeaponBuffMagic;
import test.weapon3.magic.LightWeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagic;

public class WeaponDriver {
    @Test
    void test() {
        Player player = new Player();
        player.addWeapon(new Spear());
        player.addWeapon(new Sword());

        player.addWeaponBuffMagic(new FlyingWeaponBuffMagic());
        player.addWeaponBuffMagic(new LifeStealWeaponBuffMagic());
        player.addWeaponBuffMagic(new LightWeaponBuffMagic());

        for (int weaponIndex = 0; weaponIndex < 2; weaponIndex++) {

            System.out.printf("[TEST: %s 무기 테스트]%n", player.getWeapon(weaponIndex));
            for (int weaponBuffMagicIndex = 0; weaponBuffMagicIndex < 3; weaponBuffMagicIndex++) {
                player.equip(weaponIndex, weaponBuffMagicIndex);
                System.out.println();
                player.attack(weaponIndex, weaponBuffMagicIndex);
                System.out.println();
            }
            System.out.println();
        }
    }
//


}
