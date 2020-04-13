package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Behaving.FlyWithWings;
import src.DuckPond.Quacking.Quack;

public class RedHeadDuck extends Duck implements FlyBehavior {
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
