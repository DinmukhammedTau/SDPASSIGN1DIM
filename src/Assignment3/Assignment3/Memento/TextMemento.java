package Memento;


public class TextMemento {
    private String text;

    public TextMemento(String text) {
        this.text = text;
    }
    public String retrieveText() {
        return text;
    }
}
