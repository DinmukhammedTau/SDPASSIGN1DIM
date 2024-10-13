package Command;

public class NextChannelCommand implements Command {
    private Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void run() { 
        television.channelUp(); 
    }
}
