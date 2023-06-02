package dominio.user;

public class Address {

    private String street;
    private String neighborhood;
    private String number;
    private String city;
    private String state;
    private String zipCode;
    private String complement;



    public Address(String street, String neighborhood, String number, String city, String state, String zipCode) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
