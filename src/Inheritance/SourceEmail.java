package Inheritance;

public class SourceEmail {
    public static void main(String[] args) {
        Email m1=new Email();
        m1.setMessage(" thank you for being the part of our company for this long !");
        m1.setEmail("yuvraj.srivastava6392@gmail.com");
        System.out.println(m1.sendNotification());
    }
}
