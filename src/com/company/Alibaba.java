package com.company;

public class Alibaba extends OnlineStrore{

    private Products[] products;

    public Alibaba(){
        super(10.0, 9, 15, 14);
        this.products = getProducts();
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }
}
