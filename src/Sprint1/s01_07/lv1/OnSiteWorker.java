package Sprint1.s01_07.lv1;

public class OnSiteWorker extends Worker {
    private static final float fuel = 0.5f;

    public OnSiteWorker(String name, String surname) {
        super(name, surname);
    }

    @Override
    public float computeWage(int hoursWorked) {
        return super.computeWage(hoursWorked) + fuel * getHourlyRate();
    }
}
