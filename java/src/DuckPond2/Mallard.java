package src.DuckPond2;

import src.DuckPond2.Flying.Flyable;
import src.DuckPond2.Flying.Flying;
import src.DuckPond2.Quacking.Quackable;
import src.DuckPond2.Quacking.Quacking;

public class Mallard extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Mallard fly.");
    }

    @Override
    public void quack() {
        System.out.println("Mallard's quack.");
    }

    public Mallard() {
        quackable = new Quacking();
        flyable = new Flying();
    }
}
