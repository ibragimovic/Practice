package com.company;

public class Amazon extends OnlineStrore{

    private Products[] products;

    public Amazon(){
        super(35.0, 14, 15, 5);
        this.products = getProducts();
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }


}
