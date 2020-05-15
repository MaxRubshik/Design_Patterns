package src.RemoteControl;

public class StereoWithCDComand implements Command {
    Stereo stereo;

    public StereoWithCDComand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
