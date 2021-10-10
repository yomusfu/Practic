package Task16;

public final class Customer {
    String firstName;
    String secondName;
    int age;
    Address address;
    Customer MATURE_UNKNOWN_CUSTOMER;
    Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
