package Task2122;

public class CreateImage implements ICreateDocument {
    private ImageDocument image;
    public IDocument CreateNew() {
        image = new ImageDocument();
        return image;
    }
    public IDocument CreateOpen() {
        return image;
    }
}