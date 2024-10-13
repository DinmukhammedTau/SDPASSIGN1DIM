package Memento;

public class TextEditor {
    private StringBuilder currentText;

    public TextEditor() {
        this.currentText = new StringBuilder();
    }

    public void appendText(String newText) { 
        currentText.append(newText);
    }

    public TextMemento createSnapshot() { 
        return new TextMemento(currentText.toString());
    }

    public void revertToSnapshot(TextMemento memento) { 
        this.currentText = new StringBuilder(memento.retrieveText()); 
    }

    public String retrieveCurrentText() { 
        return currentText.toString();
    }
}
