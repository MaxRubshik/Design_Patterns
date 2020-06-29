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

        Flock flockofducks = new Flock();

        flockofducks.add(redheadDuck);
        flockofducks.add(duckCall);
        flockofducks.add(rubberDuck);
        flockofducks.add(gooseDuck);

        Flock FlockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        FlockOfMallards.add(mallardOne);
        FlockOfMallards.add(mallardTwo);
        FlockOfMallards.add(mallardThree);
        FlockOfMallards.add(mallardFour);

        flockofducks.add(FlockOfMallards);


        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        //flockofducks.registerObserver(quackologist);
        simulate(flockofducks);

//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(FLockOfMallards);

        System.out.println("\nThe Ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
