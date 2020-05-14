package src.RemoteControl;

public class GarageDoorOpenComand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenComand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
