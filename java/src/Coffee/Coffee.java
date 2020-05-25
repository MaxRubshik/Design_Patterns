package src.Coffee;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();

    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk.");
    }

    private void pourInCup() {
        System.out.println("Pouring in a cup.");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter.");
    }

    private void boilWater() {
        System.out.println("Boil water.");
    }
}
