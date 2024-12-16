package Sprint1.s01_01.lv1.ex1;

public class windInstrument extends Instrument {
    {
        System.out.println("Loading: windInstrument.");
    }

    public windInstrument(String name, float price) {
        super(name, price);
    }

    public void touch() {
        System.out.println("A wind instrument is being played.");
    }
}
