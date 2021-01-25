package com.company;

public class Order {
    private Ozon ozon;
    private Amazon amazon;
    private Alibaba alibaba;
    private Products[] products;


    public Order(Ozon ozon, Amazon amazon, Alibaba alibaba, Products[] products) {
        this.ozon = ozon;
        this.amazon = amazon;
        this.alibaba = alibaba;
        this.products = products;
    }

    public void orderOnlineStore(Ozon ozon, Amazon amazon, Alibaba alibaba, Products[] products){

    }




    public Ozon getOzon() {
        return ozon;
    }

    public void setOzon(Ozon ozon) {
        this.ozon = ozon;
    }

    public Amazon getAmazon() {
        return amazon;
    }

    public void setAmazon(Amazon amazon) {
        this.amazon = amazon;
    }

    public Alibaba getAlibaba() {
        return alibaba;
    }

    public void setAlibaba(Alibaba alibaba) {
        this.alibaba = alibaba;
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }
}
