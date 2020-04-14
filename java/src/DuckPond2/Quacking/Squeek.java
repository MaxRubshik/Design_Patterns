package src.DuckPond2.Quacking;

import src.DuckPond2.Duck;

public class Squeek extends Duck implements  Quackable {
    @Override
    public void quack() {
        System.out.println("Just Squeak!");
    }
}
