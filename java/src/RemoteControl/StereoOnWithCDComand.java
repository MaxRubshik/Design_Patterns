package src.RemoteControl;

public class StereoOnWithCDComand implements Command {
    Stereo stereo;

    public StereoOnWithCDComand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
