package Design_Patterns.DuckPond;

public class DecoyDuck extends Duck implements Quackable{

    public void quack() {
        //System.out.println("Silent.");
    }

    @Override
    void display() {
        System.out.println("DecoyDuck display.");
    }
}