package test.weapon3.client;

import lombok.Getter;
import lombok.Setter;
import test.weapon3.Weapon;
import test.weapon3.activity.ActivityElement;
import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;
import test.weapon3.magic.WeaponBuffMagic;
import test.weapon3.magic.WeaponBuffMagicVisitor;

import java.util.ArrayList;
import java.util.List;

public class Player {
    @Getter
    @Setter
    private List<Weapon> weaponList;
    private List<WeaponBuffMagicVisitor> weaponBuffMagicVisitorList;

    private int currentWeaponIndex;
    private int currentWeaponBuffMagicIndex;

    private ActivityElement attack;
    private ActivityElement equip;

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
