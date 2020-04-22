package src.SturBuzz;

public class DarkRoast extends  Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        System.out.println("Its Dark Roast!");
        return null;
    }
}
