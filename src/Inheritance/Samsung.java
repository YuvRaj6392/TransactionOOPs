package Inheritance;

public class Samsung implements Mobile {

    @Override
    public String unlock()
    {
        return "Samsung unlocked!";
    }

    @Override
    public String call(String mobileNumber) {
        return "Samsung: calling "+mobileNumber;
    }

    @Override
    public String openApp(String appName) {
        return "Samsung opening "+appName;
    }
}
