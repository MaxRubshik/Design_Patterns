package Design_Patterns.DuckPond;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("Mallard Duck's display. ");
    }

    public void quack() {
        System.out.println("Mallard quacking. ");
    }

    public void fly() {
        System.out.println("Mallard flying. ");
    }
}
