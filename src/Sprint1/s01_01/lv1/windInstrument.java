package Sprint1.s01_01.lv1;

class windInstrument extends Instrument {
    {
        System.out.println("Loading: windInstrument.");
    }

    windInstrument(String name, float price) {
        super(name, price);
    }

    public void touch() {
        System.out.println("A wind instrument is being played.");
    }
}
