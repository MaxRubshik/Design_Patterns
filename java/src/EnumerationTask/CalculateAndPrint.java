package src.EnumerationTask;

public class CalculateAndPrint {
    public static void main(String[] args) {
        calculateAndPrint(1211);
        calculateAndPrint(2222);
        calculateAndPrint(1311);
    }

    private static void calculateAndPrint(int n) {
        if (n > 1000 && n < 10000) {
            if (n / 100 % 2 == 0) {
                System.out.println(n + 100);

            } else {
                int a = n * 2;
                System.out.println(a);
            }
        }
    }
}
