package Sprint1.s01_02.lv1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();
        ArrayList<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product("pen", 1));
        myProducts.add(new Product("mat1", 20));
        myProducts.add(new Product("mat2", 25));
        myProducts.add(new Product("phone", 700));
        myProducts.add(new Product("mouse", 50));
        sale.addProducts(myProducts);

        System.out.println("Sold products: ");
        ArrayList<String> productsPrint = sale.getProductNames();
        System.out.println(productsPrint);

        try {
            float total = sale.calculateTotal();
            System.out.println("Total sold: " + total);
        } catch (emptySaleException empty) {
            System.out.println(empty.getMessage());
        }

        // demonstrate emptySaleException
        try {
            Sale sale2 = new Sale();
            float total = sale2.calculateTotal();
            System.out.println("Total sold: " + total);
        } catch (emptySaleException empty) {
            System.out.println(empty.getMessage());
        }

        // demonstrate IndexOutOfBoundsException
        try {
            for (int i = 0; i < 10; i++) {
                productsPrint.get(i);
                //do stuff
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Less than 10 products.");
        }
    }
}

