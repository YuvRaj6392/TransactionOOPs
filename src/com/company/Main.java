package com.company;

public class Main {
    public static void main(String[] args) {
        Product appleMacbookAir=new Product();
        appleMacbookAir.id=1;
        appleMacbookAir.name="Apple Macbook Air";
        appleMacbookAir.category="Laptop";
        appleMacbookAir.salesPrice=80000f;
        appleMacbookAir.cost=60000f;
        appleMacbookAir.quantity=1000;

        appleMacbookAir.activate();
        System.out.println(appleMacbookAir.name);
        System.out.println(appleMacbookAir.active);
        appleMacbookAir.deactivate();
        System.out.println(appleMacbookAir.active);
        System.out.println(appleMacbookAir.getProfitOrLoss());

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

    }
}
