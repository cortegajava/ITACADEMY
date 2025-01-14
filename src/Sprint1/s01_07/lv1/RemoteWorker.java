package Sprint1.s01_07.lv1;

public class RemoteWorker extends Worker {
    private static final float internet = 0.01f;

    public RemoteWorker(String name, String surname) {
        super(name, surname);
    }

    @Override
    public float computeWage(int hoursWorked) {
        return super.computeWage(hoursWorked) + internet * getHourlyRate();
    }

    @Deprecated
    public int getNumberOfTickets() {
        return 0; // number of tickets
    }
}
