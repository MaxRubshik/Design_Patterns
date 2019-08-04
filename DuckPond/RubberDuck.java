package Design_Patterns.DuckPond;

public class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("Rubber Duck's display! ");
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("Rubber Duck not fly.");
    }

    void quack(){
        System.out.println("Rubber Duck is squeaking. ");
    }


}
