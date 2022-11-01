package com.company;

public class Main {
    public static void main(String[] args) {


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
                new Product( "Apple MacBook Air", "Laptop",
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
        System.out.println();


        Vendor lenVenInfoHub = new Vendor(1, "8th street", "Bengaluru",
                "Uttar Pradesh", "Ishwar", "1234567890",
                "ishwar.soni@gmail.com", "LenVen InfoHub");

        Order order1 = new Order(1, lenVenInfoHub, "26/10/2020",appleMacBookAir, 10, 10000);
        lenVenInfoHub.orders[0] = order1;

        System.out.println(lenVenInfoHub.orders[0]);


        lenVenInfoHub.products[0] = appleMacBookAir;
//        System.out.println(lenVenInfoHub.fetchProductByName("Apple MacBook Air").category);
        System.out.println();

        System.out.println(lenVenInfoHub.address.state);


        System.out.println(appleMacBookAir.id);
        Product dummy = new Product();
        System.out.println(dummy.id);
        System.out.println(Product.countProducts());


    }
}
