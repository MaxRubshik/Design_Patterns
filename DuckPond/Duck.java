package Design_Patterns.DuckPond;

abstract class Duck {

    void quack() {
        System.out.println("Duck is quacking.");
    }

    void swim() {

    }

    void fly() {

    }

    abstract void display();

    public static void main(String[] args) {
        RubberDuck RubberDuck = new RubberDuck();
        RubberDuck.fly();
        RubberDuck.quack();
        RubberDuck.display();
    }

}
