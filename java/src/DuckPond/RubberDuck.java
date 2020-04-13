package src.DuckPond;

import src.DuckPond.Behaving.FlyNoWay;
import src.DuckPond.Quacking.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();

    }

    @Override
    public void display() {
        System.out.println("Rubber Duck's display! ");
    }

    public void quack() {
        System.out.println("RubberDuck is squeaking");
    }

    public void fly(){

    }

}
