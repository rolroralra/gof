package test.weapon3.activity;

import test.weapon3.Weapon;
import test.weapon3.magic.WeaponBuffMagicVisitor;

public class EquipActivity extends ActivityElement {
    public EquipActivity(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void accept(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        System.out.println(this.weapon.getClass().getSimpleName() + "을 장비했습니다.");
        weaponBuffMagicVisitor.visit(this);
    }
}
