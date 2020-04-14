package src.DuckPond2;

import src.DuckPond2.Quacking.Squeek;

public class App {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        RubberDuck rubberDuck = new RubberDuck();

        mallard.fly();
        mallard.quack();
        mallard.tryToQuack();
        mallard.setQuackable(new Squeek());
        mallard.tryToFly();
    }
}
