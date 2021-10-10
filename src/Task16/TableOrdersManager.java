package Task16;

public class TableOrdersManager implements OrdersManager {
    Order[] orders;
    void add(Order order,int tableNumber){}
    void addItem(MenuItem item,int tableNumber){}
    int freeTableNumber(){return 0;}
    int[] freeTableNumbers(){return null;}
    Order getOrder(int tableNumber){return null;}
    void remove(int tableNumber){}
    int remove(Order order){return 0;}
    int removeAll(Order order){return 0;}

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
