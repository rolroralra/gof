package test.weapon3.client;

import lombok.Getter;
import lombok.Setter;
import test.weapon3.Weapon;
import test.weapon3.magic.WeaponBuffMagic;

import java.util.Objects;

public class Player {
    @Getter
    @Setter
    private Weapon weapon;

    public void attack() {
        if (Objects.isNull(weapon)) {
            return;
        }

        weapon.attack();
    }

    public void equip() {
        if (Objects.isNull(weapon)) {
            return;
        }

        weapon.equip();
    }

    public void setWeaponBuffMagic(WeaponBuffMagic weaponBuffMagic) {
       this.getWeapon().setWeaponBuffMagicVisitor(weaponBuffMagic);
    }

    @Override
    public String toString() {
        return "Player{" +
                "weapon=" + weapon +
                '}';
    }
}
