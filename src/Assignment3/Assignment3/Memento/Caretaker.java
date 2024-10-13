package Memento;

public class Caretaker {
    private TextMemento memento;

    public void preserveSnapshot(TextMemento memento) { 
        this.memento = memento;
    }

    public TextMemento getSnapshot() { 
        return this.memento;
    }
}
