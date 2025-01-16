package Sprint1.s01_07.lv1;

public class RemoteWorkerWrapper {
    private final RemoteWorker worker;

    public RemoteWorkerWrapper(RemoteWorker worker) {
        this.worker = worker;
    }

    public Worker getWorker() {
        return worker;
    }

    @SuppressWarnings("deprecation")
    public int getNumberOfTickets(){
        return worker.getNumberOfTickets();
    }
}
