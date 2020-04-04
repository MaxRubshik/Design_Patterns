package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Quacking.QuackBehavior;

abstract public class Duck {

    void swim() {
    }

    abstract void display();

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        rubberDuck.display();

        mallardDuck.fly();
        redHeadDuck.fly();
        redHeadDuck.swim();

        Rocket rocket = new Rocket();

        rocket.fly();

    }

}
