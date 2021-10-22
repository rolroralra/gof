package test.weapon3.activity;

import test.weapon3.magic.WeaponBuffMagicVisitor;

public class Attack extends ActivityElement {
    @Override
    public void accept(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        weaponBuffMagicVisitor.visit(this);
    }
}
