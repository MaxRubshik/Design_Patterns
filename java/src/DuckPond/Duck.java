package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Quacking.QuackBehavior;

abstract public class Duck {

    void swim() {
    }

    abstract void display();

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }


    public static void main(String[] args) {

        Rocket rocket = new Rocket();

        rocket.fly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.flyBehavior.fly();
        redHeadDuck.fly();

    }

}
