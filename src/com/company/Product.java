package com.company;

public class Product {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

//    Product () {
//        System.out.println("Created Product Object");
//        id = 1;
//        name = "default name";
//        category = "default category";
//    }

    //parameterized constructor
//    Product (int _id, String _name, String _category,
//             float _salesPrice, float _cost, int _quantity,
//             boolean _active) {
//        id = _id;
//        name = _name;
//        category = _category;
//        salesPrice = _salesPrice;
//        cost = _cost;
//        quantity = _quantity;
//        active = _active;
//    }
//
//
//    //copy constructor
//    Product (Product product) {
//        id = product.id;
//        name = product.name;
//        category = product.category;
//        salesPrice = product.salesPrice;
//        cost = product.cost;
//        quantity = product.quantity;
//        active = product.active;
//    }
//
//    float getProfitOrLoss() {
//        return salesPrice - cost;
//    }
//
//    void activate() {
//        active = true;
//    }
//
//    void deactivate() {
//        active = false;
//    }
//
//    boolean isBelowThreshold() {
//        return quantity < 100;
//    }
    Product() {
        this(1, "product", "category",
                0f, 0f, 0, false);
    }
    Product (int id, String name, String category,
             float salesPrice, float cost, int quantity,
             boolean active) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.quantity = quantity;
        this.active = active;
    }

    Product (Product product) {
        this.id = product.id;
        this.name = product.name;
        this.category = product.category;
        this.salesPrice = product.salesPrice;
        this.cost = product.cost;
        this.quantity = product.quantity;
        this.active = product.active;
    }

    float getProfitOrLoss() {
        return this.salesPrice - this.cost;
    }

    void activate() {
        this.active = true;
    }

    void deactivate() {
        this.active = false;
    }

    boolean isBelowThreshold() {
        return this.quantity < 100;
    }
}