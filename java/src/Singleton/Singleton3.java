package src.Singleton;

public class Singleton3 {
    private volatile static Singleton3 uniqueInstance;

    private Singleton3() {
    }

    public static Singleton3 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
