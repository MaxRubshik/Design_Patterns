package src.DuckPond;

public class Squeak extends Duck implements QuackBehavior {
    @Override
    void display() {

    }

    @Override
    public void quack() {
        System.out.println("Sqeak!");
    }
}
