package src.DuckPond;

import src.DuckPond.Behaving.Flyable;
import src.DuckPond.Quacking.Quackable;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("RedHeadDuck display! ");
    }

    public void quack() {
        System.out.println("RedHeadDuck is flying. ");
    }

    public void fly(){
        System.out.println("RedHeadDuck flyies.");
    }

}
