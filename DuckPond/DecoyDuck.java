package Design_Patterns.DuckPond;

public class DecoyDuck extends Duck {

    void quack() {
        //System.out.println("Silent.");
    }

    @Override
    void display() {
        System.out.println("DecoyDuck display.");
    }
}