package src.Game.Characters;

import src.Game.WeaponBehavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void performWeaponMove(){
        weaponBehavior.useWeapon();
    }

    abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
