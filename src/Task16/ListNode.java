package Task16;

public class ListNode extends InternetOrder {
    ListNode next;
    ListNode value;

    public ListNode(Customer c) {
        super(c);
    }

    public ListNode(MenuItem[] arr, Customer c) throws AlcoholForNotMatureCustomerException {
        super(arr, c);
    }
}
