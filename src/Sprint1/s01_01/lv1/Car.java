package Sprint1.s01_01.lv1;

class Car {
    private static final String brand = "car_brand";
    private static String model;
    private final int horsepower;

    Car(String _model, int _power) {
        model = _model;
        horsepower = _power;
    }

    // i dont liek this but its part of the task
    static void brake() {
        System.out.println("The vehicle is braking");
    }
    void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}

