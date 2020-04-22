package src.SturBuzz;

public class Decaf extends Beverage {

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void getDescription() {
        System.out.println("it's Decaf");
    }
}
