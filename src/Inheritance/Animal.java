package Inheritance;

public abstract class Animal {
    private int id;
    private String name;
    Animal(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    private void obstacle()
    {
        System.out.println("obstacle removed!");
    }
    public abstract void jump();
    public abstract void run();
}
