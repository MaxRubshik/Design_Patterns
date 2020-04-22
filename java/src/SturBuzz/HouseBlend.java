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

    @Override
    public boolean hasMilk() {
        return false;
    }

    @Override
    public boolean hasSoy() {
        return false;
    }

    @Override
    public boolean hasMocha() {
        return false;
    }

    @Override
    public boolean setMilk() {
        return false;
    }

    @Override
    public boolean setSoy() {
        return false;
    }

    @Override
    public boolean setMocha() {
        return false;
    }
}
