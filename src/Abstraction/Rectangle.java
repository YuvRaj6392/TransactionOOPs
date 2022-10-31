package Abstraction;

public class Rectangle {
    int length;
    int width;
    public int getPerimeter()
    {
        int c;
        c=2*(length+width);
        return c;
    }
    public int getArea()
    {
        int a= length * width;
        return a;
    }

}
