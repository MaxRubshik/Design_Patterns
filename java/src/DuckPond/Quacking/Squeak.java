package src.DuckPond.Quacking;

import src.DuckPond.Duck;

public abstract class Squeak extends Duck implements QuackBehavior {
//    @Override
//    void display() {
//
//    }

    @Override
    public void quack() {
        System.out.println("Sqeak!");
    }
}
