package dominio.store;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<ItemPurchase> items;
    private double totalValue;

    public void addItemToCart(ItemPurchase item) {
        if (this.items == null) {
            this.items = new ArrayList<ItemPurchase>();
        }
        this.totalValue += item.getSubTotal();
        this.items.add(item);
    }

    public void removeItemFromCart(ItemPurchase item) {
        this.totalValue -= item.getSubTotal();
        this.items.remove(item);
    }

    public ArrayList<ItemPurchase> getItems() {
        for (ItemPurchase item : this.items) {
            System.out.println("----------------------------------");
            System.out.println("Product: " + item.getProduct().getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Value: " + item.getProductValue());
            System.out.println("SubTotal: " + item.getSubTotal());
        }
        return null;
    }

    public double getTotalValue() {
        return this.totalValue;
    }
}
