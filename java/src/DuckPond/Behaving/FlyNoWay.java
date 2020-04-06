package src.DuckPond.Behaving;

import src.DuckPond.Duck;

public class FlyNoWay extends Duck implements FlyBehavior {
//    @Override
//    void display() {
//
//    }

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
