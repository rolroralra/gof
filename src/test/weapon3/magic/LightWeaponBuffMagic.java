package test.weapon3.magic;

import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;

public class LightWeaponBuffMagic implements WeaponBuffMagicVisitor {
    @Override
    public void visit(Equip equip) {
        System.out.println("[빛, Equip] 성스러운 빛을 위하여.");
    }

    @Override
    public void visit(Attack attack) {
        System.out.println("[빛, Attack] 빛이 우리와 함께 하리라!");
    }
}
