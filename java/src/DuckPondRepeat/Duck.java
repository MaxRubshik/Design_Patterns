package src.DuckPondRepeat;

import src.DuckPondRepeat.Fly.Flyable;
import src.DuckPondRepeat.Quack.Quackable;

public abstract class Duck {

    abstract void display();

    public void swim() {
        System.out.println("All ducks can swim.");
    }

    Flyable flyable;
    Quackable quackable;

    public void tryToFly() {
        flyable.fly();
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
