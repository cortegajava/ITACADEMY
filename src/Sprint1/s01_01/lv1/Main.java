package Sprint1.s01_01.lv1;

import Sprint1.s01_01.lv1.ex1.percussionInstrument;
import Sprint1.s01_01.lv1.ex1.stringInstrument;
import Sprint1.s01_01.lv1.ex1.windInstrument;
import Sprint1.s01_01.lv1.ex2.Car;

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





