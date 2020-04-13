package src.DuckPondRepeat;

public class RubberDuck extends Duck implements Quackable, Flyable {

    @Override
    void display() {
        System.out.println("It's Rubber duck.");
    }

    @Override
    public void fly() {
        System.out.println("no fly(((");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
