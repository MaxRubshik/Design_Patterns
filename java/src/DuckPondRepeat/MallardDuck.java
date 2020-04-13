package src.DuckPondRepeat;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("It's Mallard duck.");
    }

    @Override
    public void fly() {
        System.out.println("Mallard is flying.");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
