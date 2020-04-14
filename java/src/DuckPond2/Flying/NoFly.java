package src.DuckPond2.Flying;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("No fly.");
    }
}
