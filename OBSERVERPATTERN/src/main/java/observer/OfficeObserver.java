package observer;

public class OfficeObserver implements Observer {
    private final int officerID;

    public OfficeObserver() {
        this.officerID = 2401232;
    }

    @Override
    public void update(String message) {
        System.out.println("Allot Officer " + officerID + " Cust_id: " + message);
    }
}
