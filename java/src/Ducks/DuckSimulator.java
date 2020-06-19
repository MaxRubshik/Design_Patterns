package src.Ducks;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite Flocks");

        Flok flokOfDucks = new Flok();

        flokOfDucks.add(redheadDuck);
        flokOfDucks.add(duckCall);
        flokOfDucks.add(rubberDuck);
        flokOfDucks.add(gooseDuck);

        Flok flokOfMallards = new Flok();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flokOfMallards.add(mallardOne);
        flokOfMallards.add(mallardTwo);
        flokOfMallards.add(mallardThree);
        flokOfMallards.add(mallardFour);

        flokOfDucks.add(flokOfMallards);


        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flokOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flokOfMallards);

        System.out.println("\nThe Ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
