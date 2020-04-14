package src.DuckPondRepeat;

import src.DuckPondRepeat.Fly.FlyNoWay;
import src.DuckPondRepeat.Quack.Quackable;

public class App {

    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.display();

        MallardDuck mallardDuck = new MallardDuck();

        System.out.println();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.tryToFly();
        mallardDuck.setQuackable((Quackable) new FlyNoWay());
        mallardDuck.tryToFly();
    }


}
