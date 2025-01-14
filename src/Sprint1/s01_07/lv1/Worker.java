package Sprint1.s01_07.lv1;

public class Worker {
    private final String name;
    private final String surname;
    private float hourlyRate=0.f;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public float computeWage(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }

    public void setHourlyRate(float rate) {
        hourlyRate = rate;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

}
