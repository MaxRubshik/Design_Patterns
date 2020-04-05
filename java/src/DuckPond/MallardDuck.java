package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Behaving.FlyWithWings;
import src.DuckPond.Quacking.Quack;
import src.DuckPond.Quacking.QuackBehavior;

public class MallardDuck extends Duck implements QuackBehavior, FlyBehavior {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
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
