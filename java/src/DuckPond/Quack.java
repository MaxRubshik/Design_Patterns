package src.DuckPond;

public class Quack extends Duck implements QuackBehavior {
    @Override
    void display() {

    }

    @Override
    public void quack() {
        System.out.println("Quack, quack.");
    }
}
