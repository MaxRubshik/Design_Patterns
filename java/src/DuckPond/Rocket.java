package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;

public class Rocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket flying.");
    }
}
