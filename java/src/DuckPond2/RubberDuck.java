package src.DuckPond2;

import src.DuckPond2.Flying.Flyable;
import src.DuckPond2.Quacking.Quackable;

public class RubberDuck extends Duck implements Quackable, Flyable {
    @Override
    public void fly() {
        System.out.println("Rubber duck not fly");
    }

    @Override
    public void quack() {
        System.out.println("Rubber duck not quacking.");
    }
}
