package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
import src.DuckPond.Behaving.FlyWithWings;
import src.DuckPond.Quacking.QuackBehavior;

public abstract class Duck {

    void display() {

    }

    public Duck() {

    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim(){
        System.out.println("All ducks swimming.");
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
