package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Behaving.FlyWithWings;
import src.DuckPond.Quacking.QuackBehavior;

public class Duck {

    //    void swim() {
//    }
//
    void display() {

    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }


    public static void main(String[] args) throws NullPointerException {

        Rocket rocket = new Rocket();

        //rocket.fly();

        Duck redHeadDuck = new RedHeadDuck();

        redHeadDuck.performFly();
        ((RedHeadDuck) redHeadDuck).fly();
        redHeadDuck.display();

    }

}
