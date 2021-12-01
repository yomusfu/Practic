package Task2122;

public class CreateText implements ICreateDocument {
    private TextDocument text;
    public IDocument CreateNew() {
        text = new TextDocument();
        return text;
    }
    public IDocument CreateOpen() {
        return text;
    }
}