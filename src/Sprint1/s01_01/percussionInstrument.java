package Sprint1.s01_01;

class percussionInstrument extends Instrument {
    {
        System.out.println("Loading: percussionInstrument.");
    }

    percussionInstrument(String name, float price) {
        super(name, price);
    }

    public void touch() {
        System.out.println("A percussion instrument is being played.");
    }
}
