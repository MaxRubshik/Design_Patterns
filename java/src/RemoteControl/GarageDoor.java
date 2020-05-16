package src.RemoteControl;

public class GarageDoor extends Light{
    public GarageDoor(String name) {
        super(name);
    }

    public GarageDoor() {

    }

    public void up(){
        System.out.println("Door is open");
    }
    public void down(){
        System.out.println("Door is closed");
    }

    public void stop(){
        System.out.println("Door is stopped");
    }
}
