package Sprint1.s01_02;

import java.util.ArrayList;

public class Sale {
    // could change to custom hashmap that doesn't count 0s
    private ArrayList<Product> products;
    private float totalSale;

    public Sale(ArrayList<Product> _products) {
        products = new ArrayList<Product>(_products);
    }
    public Sale() {
        products = new ArrayList<Product>();
    }

    public float getTotalSale() {
        return totalSale;
    }

    public float calculateTotal() throws emptySaleException {
        if (products.isEmpty()) {
            throw new emptySaleException();
        }
        float total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        totalSale = total;
        return totalSale;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public boolean addProducts(ArrayList<Product> _products) {
        if(_products.isEmpty()) {
            return false;
        }
        products.addAll(_products);
        return true;
    }

    public ArrayList<String> getProductNames() {
        ArrayList<String> available = new ArrayList<String>();
        for (Product p : products) {
            available.add(p.getName());
        }
        return available;
    }

}
