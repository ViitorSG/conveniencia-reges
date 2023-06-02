package dominio.user;

import java.util.Calendar;

public abstract class Person {

    private String fullName; //legal name
    private String shortName; //trade name
    private String email;
    private Address address;
    private String phone;
    private Calendar birthEstablishmentDate;
    private String document; //CNPJ or CPF
    private String rgIe; //state registration or ID

    public Person(String fullName, String shortName, Address address, String phone, Calendar birthEstablishmentDate, String document, String rgIe, String email) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.address = address;
        this.phone = phone;
        this.birthEstablishmentDate = birthEstablishmentDate;
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

    public Calendar getBirthEstablishmentDate() {
        return birthEstablishmentDate;
    }

    public String getDocument() {
        return document;
    }

    public String getRgIe() {
        return rgIe;
    }

}