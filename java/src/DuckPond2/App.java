package src.DuckPond2;

import src.DuckPond2.Mallard;
import src.DuckPond2.Quacking.Squeek;
import src.DuckPond2.RubberDuck;

public class App {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        mallard.fly();
        mallard.quack();
        mallard.tryToQuack();
        mallard.setQuackable(new Squeek());
        mallard.tryToFly();


        RubberDuck rubberDuck = new RubberDuck();
    }
}
