package Sprint1.s01_01;

public class Main {
    public static void main(String[] args) {

        windInstrument flute = new windInstrument("flute", 7.f);
        stringInstrument guitar = new stringInstrument("guitar", 8.f);
        percussionInstrument drum = new percussionInstrument("drum", 9.f);

        Car car = new Car("S3", 50000);
        car.accelerate();
        Car.brake();

    }
}





