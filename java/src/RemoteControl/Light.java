package src.RemoteControl;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public Light() {

    }

    public void on() {
        System.out.println("Light is on.");
    }

    public void off() {
        System.out.println("Light is off.");
    }
}
