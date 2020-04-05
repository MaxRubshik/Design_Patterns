package src.DuckPond.Quacking;

import src.DuckPond.Duck;

public class Quack extends Duck implements QuackBehavior {
    private void display() {

    }

    @Override
    public void quack() {
        System.out.println("Quack, quack.");
    }
}
