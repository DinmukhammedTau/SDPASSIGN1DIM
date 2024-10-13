package Memento;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.appendText("Hello, "); 
        System.out.println("Current Text: " + editor.retrieveCurrentText());

        caretaker.preserveSnapshot(editor.createSnapshot());

        editor.appendText("world!"); 
        System.out.println("Text after addition: " + editor.retrieveCurrentText());

        editor.revertToSnapshot(caretaker.getSnapshot());
        System.out.println("Restored Text: " + editor.retrieveCurrentText()); 
    }
}
