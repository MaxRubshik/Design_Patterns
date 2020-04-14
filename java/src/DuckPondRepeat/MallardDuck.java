package src.DuckPondRepeat;

import src.DuckPondRepeat.Fly.FlyWithWings;
import src.DuckPondRepeat.Quack.Quack;

public class MallardDuck extends Duck {

    void display() {
        System.out.println("It's Mallard duck.");
    }

    public MallardDuck() {
        flyable = new FlyWithWings();
        quackable = new Quack();
    }
}
