package Task16;

public final class Address{
    String cityName;
    String streetName;
    int zipCode;
    int buildingNumber;
    char buildingLetter;
    int apartmentNumber;
    Address EMPTY_ADDRESS;

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
