package com.company;

public class Main {
    public static void main(String[] args) {
//        Product appleMacbookAir=new Product();
//        appleMacbookAir.id=1;
//        appleMacbookAir.name="Apple Macbook Air";
//        appleMacbookAir.category="Laptop";
//        appleMacbookAir.salesPrice=80000f;
//        appleMacbookAir.cost=60000f;
//        appleMacbookAir.quantity=1000;
//
//        appleMacbookAir.activate();
//        System.out.println(appleMacbookAir.name);
//        System.out.println(appleMacbookAir.active);
//        appleMacbookAir.deactivate();
//        System.out.println(appleMacbookAir.active);
//        System.out.println(appleMacbookAir.getProfitOrLoss());

        Customer customer = new Customer();

        customer.id = 1;
        customer.addressStreet = "2nd street";
        customer.addressCity = "Gorakhpur";
        customer.addressState = "Uttar Pradesh";
        customer.contactName = "Yuv Raj Srivastava";
        customer.contactPhone = "9090909090";
        customer.contactEmail = "yuvraj.srivastava6392@gmail.com";
        customer.transactionCount = 10;

        System.out.println(customer.contactName);
        System.out.println(customer.getAddressDetails());
        System.out.println(customer.calculateDiscount());
        System.out.println("Address ends");
        System.out.println();

        Product appleMacBookAir =
                new Product(1, "Apple MacBook Air", "Laptop",
                        80000f, 60000f, 1000, true);

        System.out.println(appleMacBookAir.name);
        System.out.println(appleMacBookAir.active);
        appleMacBookAir.deactivate();
        System.out.println(appleMacBookAir.active);
        System.out.println(appleMacBookAir.getProfitOrLoss());
        System.out.println("macbook ends");
        System.out.println();

        //implementing copy constructor
        Product p2=new Product(appleMacBookAir);
        p2.id=3;
        p2.name="Lenovo";
        System.out.println(p2.name);
        System.out.println(p2.active);
        p2.deactivate();
        System.out.println(p2.active);
        System.out.println(p2.getProfitOrLoss());
        System.out.println("P2 ends");
        System.out.println();


        Product hillary=new Product();
        System.out.println(hillary.name);

    }
}
