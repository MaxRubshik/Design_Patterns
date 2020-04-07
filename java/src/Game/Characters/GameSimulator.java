package src.Game.Characters;

import src.Game.WeaponBehavior.BowAndArrowBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.fight();
        queen.performWeaponMove();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.performWeaponMove();
    }
}
