package src.DuckPond.Quacking;

import src.DuckPond.Duck;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Sqeak!");
    }
}
