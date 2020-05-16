package src.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //Create all devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        //Create commands for Light controls
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenOffCommand =
                new LightOffCommand(kitchenLight);

        //Commands for ceiling controls
        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        //Commands for garageDoor controls
        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        //Commands for stereo control
        StereoOnWithCDComand stereoOnWithCD =
                new StereoOnWithCDComand(stereo);

        StereoOffWithCDCommand stereoOffWithCD =
                new StereoOffWithCDCommand(stereo);

        //Completed commands connected with remote slots
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenOffCommand);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);

        //toString shows list of slots and connected commands
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPressed(3);


    }
}
