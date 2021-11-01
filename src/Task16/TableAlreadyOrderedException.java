package Task16;

public class TableAlreadyOrderedException extends IllegalArgumentException {
    private int tNum;

    public int gettNum() {
        return tNum;
    }

    public TableAlreadyOrderedException(int tNum){
        super("Столик №"+tNum+" занят!");
        this.tNum = tNum;
    }
}