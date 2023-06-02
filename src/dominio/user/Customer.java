package dominio.user;

import java.util.Calendar;

public class Customer extends Person {

    private String loyaltyCard;

    public Customer(String fullName, String shortName, Address address, String phoneNumber, Calendar birthDate,
                    String document, String id, String email, String loyaltyCard) {
        super(fullName, shortName, address, phoneNumber, document, id, email);
        this.loyaltyCard = loyaltyCard;
    }
}
