package src.SturBuzz;

public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void getDescription() {
        System.out.println("It's Cappuccino");
    }
}
