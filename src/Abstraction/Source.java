package Abstraction;

public class Source {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=34;
        r1.width=9;
        System.out.println("Perimeter: "+r1.getArea());
        System.out.println("Area: "+r1.getPerimeter());
    }
}
