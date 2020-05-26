package src.Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Stepping the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments(){
        String ans = getUserInput();
        if(ans.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would like lemon in your tea (y/n) ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = br.readLine();
        } catch (IOException ioe){
            System.out.println(ioe);
        }

        if(answer == null) {
            return "no";
        }
        return answer;
    }
}
