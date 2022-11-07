package Inheritance;

public class SourceAnimal1 {
    public static void main(String[] args) {
        SourceAnimal obj=new SourceAnimal(1001,"Dog");
        obj.run();
        obj.jump();
        System.out.println(obj.id);
    }
}
