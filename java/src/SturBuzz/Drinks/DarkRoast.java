package src.SturBuzz.Drinks;

public class DarkRoast extends Beverage {
    @Override
    public double getCost() {
        double cost = this.cost() + getSize().getCost();
        return Math.round(cost);
    }

    public DarkRoast() {
        description = "More excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + description;
    }
}
