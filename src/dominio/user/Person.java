package dominio.user;

public abstract class Person {

    private String fullName;
    private String shortName;
    private String email;
    private Address address;
    private String phone;
    private String document;
    private String rgIe;

    public Person(String fullName, String shortName, Address address, String phone, String document, String rgIe, String email) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.address = address;
        this.phone = phone;
        this.document = document;
        this.rgIe = rgIe;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getDocument() {
        return document;
    }

    public String getRgIe() {
        return rgIe;
    }

}