package src.BallMachine;

public class SoldOutState implements State {
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Ypu can't insert. It's empty");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No coins here.");
    }

    @Override
    public void turnCrank() {
        System.out.println("No coins and balls.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs dispensed.");
    }
}
