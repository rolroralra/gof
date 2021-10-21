package test.weapon2.impl;

import test.weapon2.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println(this.getClass().getSimpleName() + "를 휘둘렀습니다.");
    }
}
