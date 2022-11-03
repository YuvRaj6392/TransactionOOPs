package Encapsulation;

public class SourceTable {
    public static void main(String[] args) {
        Table.Row r1=new Table.Row(1001,69);
        System.out.println("The row number is "+r1.getRowNumber()+" and the data is "+r1.getData());
    }
}
