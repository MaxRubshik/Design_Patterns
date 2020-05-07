package src.Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){};

    public static void main(String[] args) {
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
    }
}
