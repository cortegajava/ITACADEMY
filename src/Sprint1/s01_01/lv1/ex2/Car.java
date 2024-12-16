package Sprint1.s01_01.lv1.ex2;

public class Car {
    private static final String brand = "car_brand";
    private static String model;
    private final int horsepower;

    public Car(String _model, int _power) {
        model = _model;
        horsepower = _power;
    }

    // i dont liek this but its part of the task
    public static void brake() {
        System.out.println("The vehicle is braking");
    }
    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}

