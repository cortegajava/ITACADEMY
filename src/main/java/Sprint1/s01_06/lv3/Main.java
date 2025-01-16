package Sprint1.s01_06.lv3;

import Sprint1.s01_06.lv3.ex1.Generic;
import Sprint1.s01_06.lv3.ex1.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.takePhotos();
        Generic.genericS(s); // smartphone calls
        Generic.genericT(s); // smartphone calls
    }
}
