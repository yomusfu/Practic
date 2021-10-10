package Task16;

public interface Item {
    int price = 0;
    String name = "";
    String description="";
    public static int getPrice(){return price;}
    public static String getName(){return name;}
    public static String getDescription(){return description;}
}
