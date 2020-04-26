package src.SturBuzz;

public class DarkRoast extends  Beverage {
    public DarkRoast() {
        description = "More excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
