package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Quacking.QuackBehavior;

public class Manok implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }

    @Override
    public void quack() {
        System.out.println("Wee-eeee-ee");
    }
}
