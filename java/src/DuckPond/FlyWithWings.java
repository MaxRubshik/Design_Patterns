package src.DuckPond;

public class FlyWithWings extends Duck implements Flyable{
    @Override
    void display() {

    }

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
