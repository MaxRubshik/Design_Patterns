package src.DuckPond;

import src.DuckPond.Behaving.FlyBehavior;
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

    public void performSwim() {
        System.out.println("All ducks swimming.");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
