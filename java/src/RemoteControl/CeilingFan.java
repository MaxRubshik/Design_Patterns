package src.RemoteControl;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void ceilingFanOn(){
        System.out.println("Ceiling fan is on.");
    }

    public void ceilingFanOff(){
        System.out.println("Ceiling fan is off.");
    }
}
