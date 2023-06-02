package dominio.store;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProductByBarcode(String barcode) {
        for (Product p : products) {
            if (p.getBarcode().equals(barcode)) {
                return p;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getStockCount(Product product) {
        int count = 0;
        for (Product p : products) {
            if (p.equals(product)) {
                count++;
            }
        }
        return count;
    }

}

