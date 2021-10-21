package test.weapon2.impl;

import test.weapon2.Weapon;

public class Spear implements Weapon {
    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName() + "를 찔렀습니다.");
    }
}
