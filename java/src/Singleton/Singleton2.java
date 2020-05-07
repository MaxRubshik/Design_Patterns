package src.Singleton;

public class Singleton2 {
    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2(){

    }

    public Singleton2 getInstance(){
        return uniqueInstance;
    }


}
