package Sprint1.s01_01.lv1.ex1;

public abstract class Instrument {
    private String name;
    private float price;

    static {
        System.out.println("Loading: Instrument abstract class.");
    }
    public Instrument(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public abstract void touch();
}

