package src.BallMachine;

public class NoQuarterState implements State {
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted coin");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a coin");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no coin.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
