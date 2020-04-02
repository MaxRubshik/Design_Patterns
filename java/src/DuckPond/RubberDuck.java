package src.DuckPond;

public class RubberDuck extends Duck implements Quackable, Flyable {
    @Override
    void display() {
        System.out.println("Rubber Duck's display! ");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck is squeaking");
    }

    public void fly(){

    }

}
