package test.weapon3.magic;

import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;

public class FlyingWeaponBuffMagic implements WeaponBuffMagicVisitor {
    @Override
    public void visit(Equip equip) {
        System.out.println("[비행, Equip] 몸이 날아오릅니다.");
    }

    @Override
    public void visit(Attack attack) {
        System.out.println("[비행, Attack] 바람과 함께 사라질지니...");
    }
}
