package src.EnumerationTask;

public class Fibo {
    public static void main(String[] args) {
        printFibonacci(11);
    }

    //    static long printFibonacci(long n) {
//        // enter your code
//        if (n <= 1) {
//            return n;
//        } else {
//            return printFibonacci(n-1)+ printFibonacci(n-2);
//        }
//    }
    static void printFibonacci(long n) {
        // enter your code
        long sum = 0;
        if (n <= 1) {
            System.out.println(n);
        } else {
            //long a = printFibonacci(n - 1) + printFibonacci(n - 2);
            long a = 1;
            long b = 1;
            sum = a + b;
            while (sum < n) {
                a = b;
                b = sum;
            }
        }
        System.out.println(sum);
    }

}
