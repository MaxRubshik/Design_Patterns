package src.DuckPond;

import src.DuckPond.Behaving.FlyNoWay;
import src.DuckPond.Quacking.Quack;

public class DuckModel extends Duck {
    public DuckModel(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a model duck.");
    }
}
