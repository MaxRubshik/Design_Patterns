package src.CodeFactory;

public class App {
    public static void main(String[] args) {
        DeveloperFactory developerFactory1 = new CppDeveloperFactory();
        DeveloperFactory developerFactory2 = new JavaDeveloperFactory();
        Developer developer1 = developerFactory1.createDeveloper();
        Developer developer2 = developerFactory2.createDeveloper();

        developer1.code();
        developer2.code();
    }
}
