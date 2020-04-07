package src.Game.Characters;

import src.Game.WeaponBehavior.KnifeBehavior;
import src.Game.WeaponBehavior.WeaponBehavior;

public class Queen extends Character implements WeaponBehavior {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.println("Queen fighting");
    }

    @Override
    public void useWeapon() {
        System.out.println("Queen use weapon");
    }
}
