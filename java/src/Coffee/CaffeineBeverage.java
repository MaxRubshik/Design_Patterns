package src.Coffee;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    boolean customerWantsCondiments(){
        return true;
    };

    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water.");
    }

    private void pourInCup() {
        System.out.println("Pour in cup.");
    }

}