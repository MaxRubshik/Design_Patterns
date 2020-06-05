package src.BallMachine;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int state, int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuater() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert. Machine sold out.");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gum ball.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter.");
        }
    }

    public void ejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("Quarter returned.");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter.");
        } else  if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet.");
        }
    }

    public void turnCrank() {
        if(state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER){
            System.out.println("Ypu turned but there is no quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there is no gumballs.");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
    }
}
