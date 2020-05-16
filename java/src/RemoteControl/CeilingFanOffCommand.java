package src.RemoteControl;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.ceilingFanOff();
    }

    @Override
    public void undo() {
        ceilingFan.ceilingFanOn();
    }
}
