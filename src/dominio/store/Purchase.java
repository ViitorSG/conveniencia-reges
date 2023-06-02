package dominio.store;

import dominio.user.Customer;
import dominio.user.Employee;

import java.util.ArrayList;
import java.util.Calendar;

public class Purchase {

    private Customer customer;
    private Employee employee;
    private int purchaseNumber;
    private Calendar purchaseDate;
    public ShoppingCart shoppingCart;

    public Purchase(Customer customer,
                    Employee employee,
                    int purchaseNumber,
                    Calendar purchaseDate
    ) {
        this.customer = customer;
        this.employee = employee;
        this.purchaseNumber = purchaseNumber;
        this.purchaseDate = purchaseDate;
    }

    public void printReceipt(ArrayList<ItemPurchase> items, double totalValue, Purchase purchase) {
        System.out.println("--------Numero da compra: " + purchase.purchaseNumber + "--------------");
        System.out.println("Data da compra: " + this.purchaseDate.getTime());
        System.out.println("Numero da compra: " + purchase.purchaseNumber);
        System.out.println("Nome do cliente: " + purchase.customer.getFullName());
        System.out.println("Funcionario responsavel pela venda: " + purchase.employee.getFullName());

        System.out.println(items);

        System.out.println("----------------------------------");
        System.out.println("Total Purchase Value: " + totalValue);
        System.out.println("-----------Volte Sempre---------------");
        System.out.println("--------------------------------------");

        setPurchaseInfo();
    }

    public void setPurchaseInfo() {
        setCustomer(customer);
        setEmployee(employee);
        setPurchaseNumber(purchaseNumber);
        setPurchaseDate(purchaseDate);
        setShoppingCart(shoppingCart);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public void setPurchaseDate(Calendar purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}