package src.DuckPond;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.performSwim();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.performSwim();
    }
}
