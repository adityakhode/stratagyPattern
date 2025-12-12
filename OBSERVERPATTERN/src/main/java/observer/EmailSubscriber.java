package observer;

public class EmailSubscriber implements Observer {
    private String emailID;

    private String resolveEmail(String message) {
        if ("6835 5802 6210".equals(message)) {
            return "khodeaditya7@gmail.com";
        }
        return "khodeabhishek8@gmail.com";
    }

    @Override
    public void update(String message) {
        this.emailID = resolveEmail(message);
        System.out.println("Email to " + emailID + " :: " + message);
    }
}
