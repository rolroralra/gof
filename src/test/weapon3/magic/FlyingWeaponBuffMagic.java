package test.weapon3.magic;

import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;

@Deprecated
public class FlyingWeaponBuffMagic implements WeaponBuffMagicVisitor {
    @Override
    public void visit(EquipActivity equipActivity) {
        System.out.println("몸이 날아오릅니다.");
    }

    @Override
    public void visit(AttackActivity attackActivity) {
        System.out.println("바람과 함께 사라질지니...");
    }
}
