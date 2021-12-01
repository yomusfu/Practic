package Task2122;

public class ImageDocument implements IDocument {
    public void New() {
        System.out.println("Картинка создана");
    }
    public void Open() {
        System.out.println("Картинка открыта");
    }
    public void Save() {
        System.out.println("Картинка сохранена");
    }
    public void Exit() {
        System.out.println("Картинка закрыта");
    }

}