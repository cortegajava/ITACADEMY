package Sprint1.s01_01.lv1;

class stringInstrument extends Instrument {
    {
        System.out.println("Loading: stringInstrument.");
    }

    stringInstrument(String name, float price) {
        super(name, price);
    }

    public void touch() {
        System.out.println("A string instrument is being played.");
    }
}
