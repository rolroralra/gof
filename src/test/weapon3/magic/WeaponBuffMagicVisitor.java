package test.weapon3.magic;

import test.weapon3.activity.AttackActivity;
import test.weapon3.activity.EquipActivity;

// Visitor Pattern
public interface WeaponBuffMagicVisitor {
    void visit(EquipActivity equipActivity);
    void visit(AttackActivity attackActivity);
}
