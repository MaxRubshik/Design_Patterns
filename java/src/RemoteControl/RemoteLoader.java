package src.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //Create objects for 3 commands: High, middle and off.
        CeilingFan ceilingFan = new CeilingFan("Living room");

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        System.out.println("push ");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDComand stereoOnWithCDComand = new StereoOnWithCDComand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDComand};
        Command[] partyOff = {lightOffCommand, stereoOffWithCDCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(2, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--Pushing macro on:---");
        remoteControl.onButtonWasPushed(2);
        System.out.println("--Pushing macro off:--");
        remoteControl.offButtonWasPressed(2);
    }
}
