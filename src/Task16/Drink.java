package Task16;

public final class Drink extends MenuItem {
    int price;
    String name;
    String description;

    Drink(String name, String description) {
        super();
        this.name = name;
        this.description = description;
        this.price=0;
    }

    Drink(int price, String name, String description) {
        super();
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
