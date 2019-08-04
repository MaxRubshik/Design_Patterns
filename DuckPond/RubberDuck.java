package Design_Patterns.DuckPond;

public class RubberDuck extends Duck implements Quackable{
    @Override
    void display() {
        System.out.println("Rubber Duck's display! ");
    }

    public void quack() {
        System.out.println("RubberDuck is squeaking");
    }

}
