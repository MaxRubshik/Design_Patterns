package src.Coffee;

public class Tea {
    void prepareRecipe(){
        boilWater();
        pourInCup();
        brew();
        addCondiments();
    }

    private void brew() {
    }

    private void pourInCup() {
        System.out.println("Pour in cup.");
    }

    private void boilWater() {
        System.out.println("Boiling water.");
    }

    private void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
