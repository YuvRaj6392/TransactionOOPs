package Inheritance;

public class Email extends NotificationService{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String sendNotification()
    {
        return this.email+" "+this.getMessage();
    }
}
