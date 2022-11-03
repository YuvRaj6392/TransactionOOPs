package Encapsulation;

public class SourceOrder {
    public static void main(String[] args) {
        Order order=new Order(23,"papita");
        System.out.println(order.getId()+" and "+ order.getName());
    }

}
