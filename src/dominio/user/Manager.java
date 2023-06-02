package dominio.user;

import dominio.store.Purchase;
import dominio.store.ShoppingCart;

import java.util.Calendar;

public class Manager extends Employee {
    ShoppingCart shoppingCart;
    private String department;

    public Manager(String fullName, String shortName, Address address,
                   String phoneNumber, Calendar birthDate, String document, String id, String email, int number,
                   double salary, String position, Calendar hireDate, Calendar terminationDate, int monthlyHours, String department) {
        super(fullName, shortName, address, phoneNumber, birthDate, document, id, email, number, salary, position, monthlyHours);
        this.department = department;
    }

    public void cancelPurchase(Purchase purchase) {
        System.out.println("Compra cancelada pelo gerente: " + this.getFullName());
        System.out.println("Items contidos na compra: ");
        purchase.printReceipt(shoppingCart.getItems(), shoppingCart.getTotalValue());
    }
}
