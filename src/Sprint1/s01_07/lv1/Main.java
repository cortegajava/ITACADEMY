package Sprint1.s01_07.lv1;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("name", "surname");
        RemoteWorker remoteWorker = new RemoteWorker("a", "b");
        OnSiteWorker onSiteWorker = new OnSiteWorker("a", "b");
        w1.setHourlyRate(32);
        remoteWorker.setHourlyRate(32);
        onSiteWorker.setHourlyRate(32);
        System.out.println("Remote worker wage for 100h: " + remoteWorker.computeWage(100));
        System.out.println("On Site worker wage for 100h: " + onSiteWorker.computeWage(100));
        System.out.println("Remote worker Number of tickets: " + remoteWorker.getNumberOfTickets()); // compiler warning
        RemoteWorkerWrapper remoteWorkerWrapped = new RemoteWorkerWrapper(remoteWorker);
        System.out.println("Remote worker Number of tickets from no warnings wrapper: " + remoteWorkerWrapped.getNumberOfTickets()); // no warning
    }
}
