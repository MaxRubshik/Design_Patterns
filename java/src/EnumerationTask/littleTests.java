package src.EnumerationTask;

public class littleTests {
    public static void main(String[] args) {
        checkPalindrom("Madam i’m Adam");

    }
    public static void checkPalindrom(String s){
        s = s.replaceAll("\\W", "");
        String start = s;
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println(start);
        System.out.println(reversed);


        if(start.equalsIgnoreCase(reversed)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        // enter your code
    }
}
