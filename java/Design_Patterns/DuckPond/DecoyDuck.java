package Design_Patterns.DuckPond;

public class DecoyDuck extends Design_Patterns.DuckPond.Duck implements Design_Patterns.DuckPond.Quackable {

    public void quack() {
        //System.out.println("Silent.");
    }

    @Override
    void display() {
        System.out.println("DecoyDuck display.");
    }
}