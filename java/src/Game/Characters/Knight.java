package src.Game.Characters;

import src.Game.WeaponBehavior.KnifeBehavior;
import src.Game.WeaponBehavior.WeaponBehavior;

public class Knight extends Character implements WeaponBehavior {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.println("Knight fighting");
    }

    @Override
    public void useWeapon() {
        System.out.println("Knight use weapon");
    }
}
