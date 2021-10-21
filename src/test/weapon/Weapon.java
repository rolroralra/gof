package test.weapon;

public abstract class Weapon {
    private int power;
    protected WeaponBuffMagic weaponBuffMagic;

    protected Weapon(WeaponBuffMagic weaponBuffMagic) {
        this.weaponBuffMagic = weaponBuffMagic;
    }

    public void equip() {
        System.out.println(this.getClass().getSimpleName() + "을 장비했습니다.");
    }

    abstract public void attack();
}
