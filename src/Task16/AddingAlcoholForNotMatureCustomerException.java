package Task16;

public class AddingAlcoholForNotMatureCustomerException extends AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
