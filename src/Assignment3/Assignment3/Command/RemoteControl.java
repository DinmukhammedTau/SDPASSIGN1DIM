package Command;

public class RemoteControl {
    private Command[] buttons;

    public RemoteControl() {
        buttons = new Command[6]; 
    }
    public void assignCommand(int buttonIndex, Command command) { 
        if (buttonIndex >= 0 && buttonIndex < buttons.length) {
            buttons[buttonIndex] = command;
        } else {
            System.out.println("Invalid button index.");
        }
    }

    public void pressButton(int buttonIndex) { 
        if (buttonIndex >= 0 && buttonIndex < buttons.length) {
            if (buttons[buttonIndex] != null) {
                buttons[buttonIndex].run(); 
            } else {
                System.out.println("No command assigned to this button.");
            }
        } else {
            System.out.println("Invalid button index.");
        }
    }
}
