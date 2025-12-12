package observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Example");

        EventManager manager = new EventManager();

        OfficeObserver officer = new OfficeObserver();
        EmailSubscriber emailSubscriber = new EmailSubscriber();

        manager.attach(officer);
        manager.attach(emailSubscriber);

        manager.notifyUpdate("6835 5802 6210");
        System.out.println();
        manager.notifyUpdate("1234 5678 9101");
    }
}
