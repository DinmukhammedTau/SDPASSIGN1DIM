package Command;
public class Main {
    public static void main(String[] args) {

        Television television = new Television();

        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command volumeUp = new VolumeUpCommand(television);
        Command volumeDown = new VolumeDownCommand(television);
        Command nextChannel = new NextChannelCommand(television);
        Command previousChannel = new PreviousChannelCommand(television);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.assignCommand(0, turnOn); 
        remoteControl.assignCommand(1, turnOff);    
        remoteControl.assignCommand(2, volumeUp);   
        remoteControl.assignCommand(3, volumeDown);     
        remoteControl.assignCommand(4, nextChannel);    
        remoteControl.assignCommand(5, previousChannel); 

        remoteControl.pressButton(0); 
        remoteControl.pressButton(2); 
        remoteControl.pressButton(4);
        remoteControl.pressButton(5); 
        remoteControl.pressButton(3);
        remoteControl.pressButton(1); 
    }
}
