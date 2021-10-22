package test.weapon3.magic;

import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;

// Visitor Pattern
public interface WeaponBuffMagicVisitor {
    void visit(Equip equip);
    void visit(Attack attack);
}
