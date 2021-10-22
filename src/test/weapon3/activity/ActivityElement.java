package test.weapon3.activity;

import lombok.Data;
import test.weapon3.magic.WeaponBuffMagicVisitor;

@Data
public abstract class ActivityElement {
    abstract public void accept(WeaponBuffMagicVisitor weaponBuffMagicVisitor);
}
