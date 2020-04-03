package src.DuckPond.Behaving;

import src.DuckPond.Duck;

public abstract class FlyWithWings extends Duck implements FlyBehavior{
//    @Override
//    public void display() {
//        System.out.println("f");
//    }


    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
