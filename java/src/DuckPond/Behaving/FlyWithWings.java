package src.DuckPond.Behaving;

import src.DuckPond.Duck;

public class FlyWithWings extends Duck implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
