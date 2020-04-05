package src.DuckPond;

import src.DuckPond.Behaving.FlyNoWay;
import src.DuckPond.Behaving.Flyable;
import src.DuckPond.Quacking.Quackable;
import src.DuckPond.Quacking.Squeak;

public class RubberDuck extends Duck implements Quackable, Flyable {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();

    }

    @Override
    public void display() {
        System.out.println("Rubber Duck's display! ");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck is squeaking");
    }

    public void fly(){

    }

}
