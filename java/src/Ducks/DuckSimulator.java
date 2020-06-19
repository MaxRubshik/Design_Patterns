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

        FLock FLockOfDucks = new FLock();

        FLockOfDucks.add(redheadDuck);
        FLockOfDucks.add(duckCall);
        FLockOfDucks.add(rubberDuck);
        FLockOfDucks.add(gooseDuck);

        FLock FLockOfMallards = new FLock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        FLockOfMallards.add(mallardOne);
        FLockOfMallards.add(mallardTwo);
        FLockOfMallards.add(mallardThree);
        FLockOfMallards.add(mallardFour);

        FLockOfDucks.add(FLockOfMallards);


        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(FLockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(FLockOfMallards);

        System.out.println("\nThe Ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
