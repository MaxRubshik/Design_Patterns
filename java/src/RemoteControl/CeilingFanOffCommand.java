package src.RemoteControl;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.ceilingFanOff();
    }

    @Override
    public void undo() {
        ceilingFan.ceilingFanOn();
    }
}
