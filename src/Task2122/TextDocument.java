package Task2122;

public class TextDocument implements IDocument {
    public void New() {
        System.out.println("Файл создан");
    }
    public void Open() {
        System.out.println("Файл открыт");
    }
    public void Save() {
        System.out.println("Файл сохранен");
    }
    public void Exit() {
        System.out.println("Файл закрыт");
    }

}