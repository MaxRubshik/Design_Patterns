package src.DuckPondRepeat;

public class App {
    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.swim();

        MallardDuck mallardDuck = new MallardDuck();

        System.out.println();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.swim();
        mallardDuck.quack();
    }
}
