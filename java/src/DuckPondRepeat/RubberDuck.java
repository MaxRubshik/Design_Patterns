package src.DuckPondRepeat;

import src.DuckPondRepeat.Fly.FlyWithWings;

public class RubberDuck extends FlyWithWings {

    void display() {
        System.out.println("It's Rubber duck.");
    }

    @Override
    public void fly() {
        System.out.println("no fly(((");
    }

    public void quack() {
        System.out.println("Squeak");
    }
}
