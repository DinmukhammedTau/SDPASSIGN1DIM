package Command;

public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void run() { 
        television.powerOn(); 
    }
}
