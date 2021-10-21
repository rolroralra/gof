package test.weapon3;

import test.weapon3.activity.ActivityElement;
import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;
import test.weapon3.magic.FlyingWeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagicVisitor;

public abstract class Weapon {
    private int power;
    private ActivityElement attackActivity;
    private ActivityElement equipActivity;
    private WeaponBuffMagicVisitor weaponBuffMagicVisitor;

    public Weapon() {
        this.power = 0;
        attackActivity = new AttackActivity(this);
        equipActivity = new EquipActivity(this);
        weaponBuffMagicVisitor = new FlyingWeaponBuffMagic();
    }

    public void setWeaponBuffMagicVisitor(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        this.weaponBuffMagicVisitor = weaponBuffMagicVisitor;
    }

    void attack() {
        attackActivity.accept(weaponBuffMagicVisitor);
    }
    void equip() {
        equipActivity.accept(weaponBuffMagicVisitor);
    }
}
