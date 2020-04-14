package src.DuckPond2;

import src.DuckPond2.Flying.Flyable;
import src.DuckPond2.Quacking.Quackable;

public abstract class Duck {
    void swim(){
        System.out.println("all ducks can swim");
    }

    Quackable quackable;
    Flyable flyable;


    public void setQuackable(Quackable q) {
        quackable = q;
    }

    public void setFlyable(Flyable f) {
        flyable = f;
    }

    void tryToQuack() {
        quackable.quack();
    }

    void tryToFly() {
        flyable.fly();
    }
}
