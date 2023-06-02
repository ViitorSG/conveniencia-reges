package dominio.store;

public class ItemPurchase {

    private Purchase purchase;
    private Product product;
    private double quantity;
    private double productValue;
    private double subTotal;

    public ItemPurchase(Purchase purchase, Product product, double quantity, double productValue) {
        this.purchase = purchase;
        this.product = product;
        this.quantity = quantity;
        this.productValue = productValue;
        this.subTotal = quantity * productValue;

    }

    public Purchase getPurchase() {
        return purchase;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getProductValue() {
        return productValue;
    }

    public double getSubTotal() {
        return subTotal;
    }
}