package dominio.user;

public class Manager extends Employee {

    public Manager(String fullName, String shortName, Address address,
                   String phoneNumber, String document, String id, String email, int number,
                   double salary, String position, int monthlyHours, String department) {
        super(fullName, shortName, address, phoneNumber, document, id, email, number, salary, position, monthlyHours);
    }

    public void cancelPurchase() {
        System.out.println("Venda cancelada pelo gerente: " + this.getFullName());
        System.exit(0);
    }
}
