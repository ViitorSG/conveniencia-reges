package dominio.user;

import java.util.Calendar;

public class Supplier extends Person {

    public Supplier(String fullName, String shortName, Address address, String phoneNumber, Calendar birthDate,
                    String document, String id, String email) {
        super(fullName, shortName, address, phoneNumber, birthDate, document, id, email);
    }
}