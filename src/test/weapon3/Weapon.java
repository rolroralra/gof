package test.weapon3;

import lombok.Getter;
import lombok.Setter;
import test.weapon3.activity.ActivityElement;
import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;
import test.weapon3.magic.WeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagicVisitor;

public abstract class Weapon {
    @Getter
    @Setter
    private int power;
    private final ActivityElement attackActivity;   // Bridge Pattern
    private final ActivityElement equipActivity;    // Bridge Pattern
    private WeaponBuffMagicVisitor weaponBuffMagicVisitor;  //

    public Weapon() {
        this.power = 0;
        attackActivity = new AttackActivity(this);
        equipActivity = new EquipActivity(this);
        weaponBuffMagicVisitor = WeaponBuffMagic.getDefault();
    }

    public void setWeaponBuffMagicVisitor(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        this.weaponBuffMagicVisitor = weaponBuffMagicVisitor;
    }

    void attack() {
        // Delegate
        attackActivity.accept(weaponBuffMagicVisitor);
    }
    void equip() {
        // Delegate
        equipActivity.accept(weaponBuffMagicVisitor);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
