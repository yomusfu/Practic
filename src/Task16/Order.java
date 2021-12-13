package Task16;

public interface Order
{
    public int itemQuantity();
    public int itemQuantity(String itemName);
    public double costTotal();
    public boolean add(Item item);
    public boolean remove(String itemName);
    public Item[] getItems();
    public String[] dishesNames();
    public Item[] sortedDishesByCostDesc();
}