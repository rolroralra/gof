package test.weapon3.character;

import lombok.Getter;
import test.weapon3.activity.ActivityElement;
import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;
import test.weapon3.magic.WeaponBuffMagicVisitor;
import test.weapon3.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    @Getter
    private final List<Weapon> weaponList;  // 무기 목록
    @Getter
    private final List<WeaponBuffMagicVisitor> weaponBuffMagicVisitorList;  // 무기 버프 마법 목록

    private int currentWeaponIndex;
    private int currentWeaponBuffMagicIndex;

    private final ActivityElement attack;
    private final ActivityElement equip;

    public Player() {
        weaponList = new ArrayList<>();
        weaponBuffMagicVisitorList = new ArrayList<>();
        currentWeaponIndex = -1;
        currentWeaponBuffMagicIndex = -1;

        attack = new Attack();
        equip = new Equip();
    }

    public void equip(int weaponIndex, int weaponBuffMagicIndex) {
        // Main Process
        weaponList.get(weaponIndex).equip();    // Weapon Equip
        this.equip.accept(weaponBuffMagicVisitorList.get(weaponBuffMagicIndex));

        // Current Index Update
        this.currentWeaponIndex = weaponIndex;
        this.currentWeaponBuffMagicIndex = weaponBuffMagicIndex;
    }

    public void attack(int weaponIndex, int weaponBuffMagicIndex) {
        // Main Process
        weaponList.get(weaponIndex).attack();   // Weapon Attack
        this.attack.accept(weaponBuffMagicVisitorList.get(weaponBuffMagicIndex));

        // Current Index Update
        this.currentWeaponIndex = weaponIndex;
        this.currentWeaponBuffMagicIndex = weaponBuffMagicIndex;
    }

    public void equipRandom() {
        Random random = new Random();
        int weaponRandomIndex = random.nextInt(weaponList.size());
        int weaponBuffMagicRandomIndex = random.nextInt(weaponBuffMagicVisitorList.size());

        equip(weaponRandomIndex, weaponBuffMagicRandomIndex);
    }

    public void attackRandom() {
        Random random = new Random();
        int weaponRandomIndex = random.nextInt(weaponList.size());
        int weaponBuffMagicRandomIndex = random.nextInt(weaponBuffMagicVisitorList.size());

        attack(weaponRandomIndex, weaponBuffMagicRandomIndex);
    }

    public void addWeapon(Weapon weapon) {
        weaponList.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        weaponList.remove(weapon);
    }

    public void addWeaponBuffMagic(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        weaponBuffMagicVisitorList.add(weaponBuffMagicVisitor);
    }

    public void removeWeaponBuffMagic(WeaponBuffMagicVisitor weaponBuffMagicVisitor) {
        weaponBuffMagicVisitorList.remove(weaponBuffMagicVisitor);
    }

    public Weapon getWeapon(int weaponIndex) {
        return weaponList.get(weaponIndex);
    }

    public WeaponBuffMagicVisitor getWeaponBuffMagic(int weaponBuffMagicIndex) {
        return weaponBuffMagicVisitorList.get(weaponBuffMagicIndex);
    }

    @Override
    public String toString() {
        return "Player{" +
                "weapon=" + weaponList +
                '}';
    }
}
