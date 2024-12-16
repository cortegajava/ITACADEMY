package Sprint1.s01_01.lv1.ex1;

public class percussionInstrument extends Instrument {
    {
        System.out.println("Loading: percussionInstrument.");
    }

    public percussionInstrument(String name, float price) {
        super(name, price);
    }

    public void touch() {
        System.out.println("A percussion instrument is being played.");
    }
}
