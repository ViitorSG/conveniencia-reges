package dominio.store;

public class Product {

    private String name;
    private double quantity;
    private String barcode;
    private double costValue;
    private double saleValue;
    private String brand;
    private String ncm;


    public Product(String name, double quantity, String barcode, double costValue, double saleValue, String brand, String ncm) {
        this.name = name;
        this.quantity = quantity;
        this.barcode = barcode;
        this.costValue = costValue;
        this.saleValue = saleValue;
        this.ncm = ncm;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }
}