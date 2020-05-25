package src.Coffee;

public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void pourInCup() {
        System.out.println("Pour in cup.");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea.");
    }

    private void boilWater() {
        System.out.println("Boiling water.");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
