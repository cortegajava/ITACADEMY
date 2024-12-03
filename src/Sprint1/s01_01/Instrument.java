package Sprint1.s01_01;

public abstract class Instrument {
    private String name;
    private float price;

    static {
        System.out.println("Loading: Instrument abstract class.");
    }
    Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public abstract void touch();
}

