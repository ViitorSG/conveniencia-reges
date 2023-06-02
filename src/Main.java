import DataBaseMocked.db;
import dominio.store.ItemPurchase;
import dominio.store.Purchase;
import dominio.store.ShoppingCart;
import dominio.store.Stock;
import dominio.user.Address;
import dominio.user.Customer;
import dominio.user.Employee;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        db db = new db();
        ShoppingCart shoppingCart = new ShoppingCart();

        Address clientAddress = new Address("Trump Tower", "Fiusa", "123",
                "Serrana", "SP", "14021615");

        Calendar dateOfBirthCustomer = Calendar.getInstance();
        dateOfBirthCustomer.set(1999, Calendar.MARCH, 20);

        Customer customer = new Customer("Black Widow",
                "Natasha Romanoff",
                clientAddress,
                "8887877",
                dateOfBirthCustomer,
                "3351212",
                "3212",
                "natasha@reges.edu.br",
                "121212");

        Customer customer2 = new Customer("Black Widow",
                "Natasha Romanoff",
                clientAddress,
                "8887877",
                dateOfBirthCustomer,
                "3351212",
                "3212",
                "natasha@reges.edu.br",
                "121212");

        Address employeeAddress = new Address("Avengers Tower",
                "João Rossi",
                "9888",
                "Serrana",
                "SP",
                "14021618");

        Calendar employeeDateOfBirth = Calendar.getInstance();
        employeeDateOfBirth.set(1999, Calendar.MARCH, 20);

        Employee employee = new Employee("Hawkeye",
                "Clinton Barton",
                employeeAddress,
                "3212121",
                employeeDateOfBirth,
                "321212",
                "321212",
                "clint@reges.edu.br",
                4,
                888880,
                "Archer",
                80);

        Stock stock = new Stock();

        stock.addProduct(db.product1);
        stock.addProduct(db.product2);
        stock.addProduct(db.product3);
        stock.addProduct(db.product4);
        stock.addProduct(db.product5);
        stock.addProduct(db.product6);
        stock.addProduct(db.product7);
        stock.addProduct(db.product8);
        stock.addProduct(db.product9);
        stock.addProduct(db.product10);
        stock.addProduct(db.product11);
        stock.addProduct(db.product12);
        stock.addProduct(db.product13);
        stock.addProduct(db.product14);
        stock.addProduct(db.product15);
        stock.addProduct(db.product16);
        stock.addProduct(db.product17);
        stock.addProduct(db.product18);
        stock.addProduct(db.product19);

        Calendar purchaseDate = Calendar.getInstance();
        purchaseDate.set(2023, Calendar.MARCH, 20);

        Calendar purchaseDate2 = Calendar.getInstance();
        purchaseDate2.set(2023, Calendar.MARCH, 20);

        Purchase purchase = new Purchase(customer, employee, 12, purchaseDate);

        ItemPurchase item1 = new ItemPurchase(purchase, stock.getProductByBarcode("1"), 15.0, 52.50);
        ItemPurchase item2 = new ItemPurchase(purchase, stock.getProductByBarcode("2"), 35.0, 2.50);
        ItemPurchase item3 = new ItemPurchase(purchase, stock.getProductByBarcode("8"), 45.0, 5.50);
        ItemPurchase item4 = new ItemPurchase(purchase, stock.getProductByBarcode("7"), 55.0, 6.50);

        shoppingCart.addItemToCart(item1);
        shoppingCart.addItemToCart(item2);
        shoppingCart.addItemToCart(item3);
        shoppingCart.addItemToCart(item4);

        purchase.printReceipt(shoppingCart.getItems(), shoppingCart.getTotalValue());

        Purchase purchase1 = new Purchase(customer, employee, 13, purchaseDate2);

        ItemPurchase item5 = new ItemPurchase(purchase1, stock.getProductByBarcode("3"), 15.0, 52.50);
        ItemPurchase item6 = new ItemPurchase(purchase1, stock.getProductByBarcode("6"), 35.0, 2.50);
        ItemPurchase item7 = new ItemPurchase(purchase1, stock.getProductByBarcode("9"), 45.0, 5.50);
        ItemPurchase item8 = new ItemPurchase(purchase1, stock.getProductByBarcode("15"), 55.0, 6.50);

        shoppingCart.addItemToCart(item5);
        shoppingCart.addItemToCart(item6);
        shoppingCart.addItemToCart(item7);
        shoppingCart.addItemToCart(item8);

        purchase.printReceipt(shoppingCart.getItems(), shoppingCart.getTotalValue());
    }
}