package src.Game.Characters;

import src.Game.WeaponBehavior.SwordBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.fight();
        queen.useWeapon();
        queen.performWeaponMove();
        queen.setWeapon(new SwordBehavior());
        queen.performWeaponMove();
        queen.useWeapon();
    }
}
