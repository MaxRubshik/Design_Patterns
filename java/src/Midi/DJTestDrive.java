package src.Midi;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModeInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
