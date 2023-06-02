package dominio.user;

import java.util.Calendar;

public class Employee extends Person {
    private int number;
    private double salary;
    private String position;
    private int monthlyHours;

    public Employee(String fullName, String shortName, Address address,
                    String phoneNumber, String document, String id, String email, int number,
                    double salary, String position, int monthlyHours) {

        super(fullName, shortName, address, phoneNumber, document, id, email);

        this.number = number;
        this.salary = salary;
        this.position = position;
        this.monthlyHours = monthlyHours;

    }

}