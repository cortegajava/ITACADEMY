package Sprint1.s01_06.lv3.ex1;

public class Smartphone implements Telephone {
    @Override
    public void call() {
        System.out.println("Smartphone is calling. ");
    }

    public void takePhotos() {
        System.out.println("Smartphone is taking photos. ");
    }
}
