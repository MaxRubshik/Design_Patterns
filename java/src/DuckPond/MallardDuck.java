package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Quacking.QuackBehavior;

public class MallardDuck extends Duck implements QuackBehavior, FlyBehavior {

    @Override
    void display() {
        System.out.println("Mallard display. ");
    }

    @Override
    public void quack() {
        System.out.println("Mallard quacking. ");
    }

    @Override
    public void fly() {
        System.out.println("Mallard flying. ");
    }
}
