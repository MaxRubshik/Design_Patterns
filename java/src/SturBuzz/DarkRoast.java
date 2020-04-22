package src.SturBuzz;

public class DarkRoast extends  Beverage {
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void getDescription() {
        System.out.println("Its Dark Roast!");
    }
}
