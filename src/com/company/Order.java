package com.company;

public class Order {
    int id;

    Vendor vendor;
    String date;
    int orderedQuantity;
    float amountPaid;
    Product orderedProduct;
    Order(int id, Vendor vendor, String date,Product orderedProduct, int orderedQuantity, float amountPaid) {
        this.id = id;
        this.vendor = vendor;
        this.date = date;
        this.orderedProduct = orderedProduct;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;
    }

    void updateVendorCredit() {
        this.vendor.credit += (orderedProduct.cost * orderedQuantity - amountPaid);
    }
}
