package test.weapon3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import test.weapon3.character.Player;
import test.weapon3.magic.FlyingWeaponBuffMagic;
import test.weapon3.magic.LifeStealWeaponBuffMagic;
import test.weapon3.magic.LightWeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagicVisitor;
import test.weapon3.weapon.Spear;
import test.weapon3.weapon.Sword;
import test.weapon3.weapon.Weapon;

public class WeaponDriver {
    @Test
    void test_Weapon_Attack_Equip_With_BuffMagic() {
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


    @ParameterizedTest
    @ValueSource(ints = {5})
    void test_Weapon_Attack_Equip_With_BuffMagic_Random(int count) {
        Player player = new Player();
        player.addWeapon(new Spear());
        player.addWeapon(new Sword());

        player.addWeaponBuffMagic(new FlyingWeaponBuffMagic());
        player.addWeaponBuffMagic(new LifeStealWeaponBuffMagic());
        player.addWeaponBuffMagic(new LightWeaponBuffMagic());

        for (int i = 0; i < count; i++) {
            player.equipRandom();
            player.attackRandom();
            System.out.println();
        }
    }
}
