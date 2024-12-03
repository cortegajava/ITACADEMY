package Sprint1.s01_02;

class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.price = price;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
