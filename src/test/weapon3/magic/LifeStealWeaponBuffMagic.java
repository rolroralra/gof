package test.weapon3.magic;

import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;

@Deprecated
public class LifeStealWeaponBuffMagic implements WeaponBuffMagicVisitor {
    @Override
    public void visit(EquipActivity equipActivity) {
        System.out.println("난 피가 부족해.");
    }

    @Override
    public void visit(AttackActivity attackActivity) {
        System.out.println("피가 굉장히 달곰한걸?!");
    }
}
