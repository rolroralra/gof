package test.weapon3.activity;

import test.weapon3.Weapon;
import test.weapon3.magic.WeaponBuffMagicVisitor;

public class AttackActivity extends ActivityElement {
    public AttackActivity(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void accept(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        System.out.println(this.weapon.getClass().getSimpleName() + "을 휘둘렀습니다.");
        weaponBuffMagicVisitor.visit(this);
    }
}
