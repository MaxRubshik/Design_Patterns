package src.Chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            //make boiled
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
