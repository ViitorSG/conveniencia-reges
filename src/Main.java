import DataBaseMocked.db;
import dominio.store.ItemPurchase;
import dominio.store.Purchase;
import dominio.store.ShoppingCart;
import dominio.store.Stock;
import dominio.user.Address;
import dominio.user.Customer;
import dominio.user.Employee;
import dominio.user.Manager;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        db db = new db();
        ShoppingCart shoppingCart = new ShoppingCart();

        Calendar dateOfBirthCustomer = Calendar.getInstance();
        dateOfBirthCustomer.set(1999, Calendar.MARCH, 20);

        Calendar employeeDateOfBirth = Calendar.getInstance();
        employeeDateOfBirth.set(1999, Calendar.MARCH, 20);

        Calendar purchaseDate = Calendar.getInstance();
        purchaseDate.set(2023, Calendar.MARCH, 20);

        Calendar purchaseDate2 = Calendar.getInstance();
        purchaseDate2.set(2023, Calendar.MARCH, 20);

        Address clientAddress = new Address("Trump Tower", "Fiusa", "123",
                "Serrana", "SP", "14021615");

        Address employeeAddress = new Address("Av itatiaia",
                "Alto da boa vista",
                "1414",
                "Ribeirão Preto",
                "SP",
                "14021618");

        Address employeeAddress2 = new Address("Rua paraiso",
                "Vila tibério",
                "104",
                "Ribeirão Preto",
                "SP",
                "14022371");

        Address employeeAddress3 = new Address("Av maurílio biagi",
                "City ribeirão",
                "478",
                "Ribeirão Preto",
                "SP",
                "14039892");

        Customer customer = new Customer("Gabriel Paulino",
                "Gabriel",
                clientAddress,
                "992132458",
                dateOfBirthCustomer,
                "3351212",
                "1",
                "gabriel@reges.com.br",
                "12345");

        Customer customer2 = new Customer("Victor Rafael",
                "Victor",
                clientAddress,
                "993421145",
                dateOfBirthCustomer,
                "3351313",
                "2",
                "victor@reges.com.br",
                "54321");

        Customer customer3 = new Customer("Paulo Oliveira",
                "Paulo",
                clientAddress,
                "981421359",
                dateOfBirthCustomer,
                "3351414",
                "3",
                "paulo@reges.com.br",
                "34512");

        Employee employee = new Employee("Leandro Moraes",
                "Leandro",
                employeeAddress,
                "982347899",
                "345580",
                "102",
                "leandro@reges.com.br",
                5,
                2500,
                "Caixa",
                20);

        Employee employee2 = new Employee("Maycon Douglas",
                "Maycon",
                employeeAddress,
                "982344050",
                "345579",
                "105",
                "maycon@reges.com.br",
                6,
                2700,
                "Caixa",
                25);

        Manager manager = new Manager(
                "Leandro Moraes",
                "Leandro",
                employeeAddress,
                "982347899",
                "345580",
                "102",
                "leandro@gmail.com",
                5,
                2500,
                "Caixa",
                20,
                "Gerente"
        );

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

        Purchase purchase = new Purchase(customer, employee, 12, purchaseDate);

        ItemPurchase item1 = new ItemPurchase(purchase, stock.getProductByBarcode("1"), 15.0, 52.50);
        ItemPurchase item2 = new ItemPurchase(purchase, stock.getProductByBarcode("2"), 35.0, 2.50);
        ItemPurchase item3 = new ItemPurchase(purchase, stock.getProductByBarcode("8"), 45.0, 5.50);
        ItemPurchase item4 = new ItemPurchase(purchase, stock.getProductByBarcode("7"), 55.0, 6.50);

        shoppingCart.addItemToCart(item1);
        shoppingCart.addItemToCart(item2);
        shoppingCart.addItemToCart(item3);
        shoppingCart.addItemToCart(item4);

        purchase.printReceipt(shoppingCart.getItems(), shoppingCart.getTotalValue(), purchase );

        Purchase purchase1 = new Purchase(customer2, employee, 13, purchaseDate2);

        ItemPurchase item5 = new ItemPurchase(purchase1, stock.getProductByBarcode("3"), 15.0, 52.50);
        ItemPurchase item6 = new ItemPurchase(purchase1, stock.getProductByBarcode("6"), 35.0, 2.50);
        ItemPurchase item7 = new ItemPurchase(purchase1, stock.getProductByBarcode("9"), 45.0, 5.50);
        ItemPurchase item8 = new ItemPurchase(purchase1, stock.getProductByBarcode("15"), 55.0, 6.50);

        shoppingCart.addItemToCart(item5);
        shoppingCart.addItemToCart(item6);
        shoppingCart.addItemToCart(item7);
        shoppingCart.addItemToCart(item8);

        manager.cancelPurchase();

        purchase.printReceipt(shoppingCart.getItems(), shoppingCart.getTotalValue(), purchase1);


    }
}