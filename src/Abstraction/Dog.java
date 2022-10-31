package Abstraction;

public class Dog {
    String name;
    String owner;
    Boolean male;
    Dog(String name,String owner,Boolean male)
    {
        this.name=name;
        this.owner=owner;
        this.male=male;
    }
    Dog(Dog dog)
    {
        this.name=dog.name;
        this.owner=dog.owner;
        this.male=dog.male;
    }
}
