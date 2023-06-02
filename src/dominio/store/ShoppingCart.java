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
            System.out.println("--------------Conveniencia Reges--------------");
            System.out.println("Produto: " + item.getProduct().getName());
            System.out.println("Quantidade de produto: " + item.getQuantity());
            System.out.println("Valor unico do produto: " + item.getProductValue());
            System.out.println("SubTotal da compra: " + item.getSubTotal());
        }
        return null;
    }

    public double getTotalValue() {
        return this.totalValue;
    }
}
