package test.weapon3.magic;

import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;

public class LifeStealWeaponBuffMagic implements WeaponBuffMagicVisitor {
    @Override
    public void visit(Equip equip) {
        System.out.println("[흡혈, Equip] 난 피가 부족해.");
    }

    @Override
    public void visit(Attack attack) {
        System.out.println("[흡혈, Attack] 피가 굉장히 달콤한걸?!");
    }
}
