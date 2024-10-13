package Command;

public class TurnOffCommand implements Command {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void run() { 
        television.powerOff(); 
    }
}
