package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Behaving.FlyWithWings;
import src.DuckPond.Behaving.Flyable;
import src.DuckPond.Quacking.Quack;
import src.DuckPond.Quacking.Quackable;

public class RedHeadDuck extends Duck implements Flyable, Quackable, FlyBehavior {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck display! ");
    }

    public void quack() {
        System.out.println("RedHeadDuck is flying. ");
    }

    public void fly(){
        System.out.println("RedHeadDuck flyies.");
    }

}
