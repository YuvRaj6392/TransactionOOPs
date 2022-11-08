package Inheritance;

public abstract class NotificationService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public abstract String sendNotification();
}
