package Abstraction;

public class SourceDog {
    public static void main(String[] args) {
        Dog d1=new Dog("Billu","Yuvraj",true);
        Dog d2=new Dog(d1);
        System.out.println(d2.name);
        System.out.println(d2.owner);
        System.out.println(d2.male);

        System.out.println();
        System.out.println(d1.name + " is a " + (d1.male ? "male" : "female") + " dog");

    }
}
