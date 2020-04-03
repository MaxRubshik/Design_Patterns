package src.DuckPond;

abstract class Duck {

    void swim() {

    }

    abstract void display();

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        rubberDuck.display();

        mallardDuck.fly();
        redHeadDuck.fly();
        redHeadDuck.swim();

        Rocket rocket = new Rocket();

        rocket.fly();
    }

}
