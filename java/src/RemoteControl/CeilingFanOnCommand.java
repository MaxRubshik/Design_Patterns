package src.RemoteControl;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.ceilingFanOn();
    }

    @Override
    public void undo() {
        ceilingFan.ceilingFanOff();
    }
}
