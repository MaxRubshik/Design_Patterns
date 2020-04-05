package src.DuckPond.Behaving;

import src.DuckPond.Duck;

public class FlyWithWings extends Duck implements FlyBehavior{
//    @Override
//    public void display() {
//        System.out.println("its FlyWithWingsDisplay");
//    }


    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
