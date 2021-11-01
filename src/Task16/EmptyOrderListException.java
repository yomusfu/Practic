package Task16;

public class EmptyOrderListException extends NullPointerException {
    public EmptyOrderListException(){
        super("Нет ни одного заказа!");
    }
}
