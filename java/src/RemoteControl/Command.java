package src.RemoteControl;

public interface Command {
    public void execute();
    public void undo();
}
