package src.DuckPond2;

import src.DuckPond2.Flying.Flyable;
import src.DuckPond2.Quacking.Quackable;

public class Mallard extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("I'm fly.");
    }

    @Override
    public void quack() {
        System.out.println("Mallard's quack.");
    }

    public Mallard() {
        q
    }
}
