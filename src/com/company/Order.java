package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Order {
    private Ozon order1;
    private Amazon order2;
    private Alibaba order3;
    private Products[] products;


    public Order(Ozon order1, Amazon order2, Alibaba order3, Products[] products) {
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
        this.products = products;
    }


    public Products[] getShoppingBasket(Products[] getProducts){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Products[] shoppingBasket = new Products[count];
        for (int i = 0; i < products.length; i++){
            boolean buyProduct = sc.nextBoolean();{
                if (buyProduct = true){
                    shoppingBasket[count] = getProducts[i];
                    count++;
                }
            }
        }
        return shoppingBasket;
    }

    public double countPrice(Products[] shoppingBasket) {
        double price = 0;
        for (int i = 0; i < shoppingBasket.length; i++) {
            price += shoppingBasket[i].getPriceProducts();
        }
        return price;
    }

    public void countFinalPrice(Ozon order1, Amazon order2, Alibaba order3, Products[] shoppingBasket) {
        double price = countPrice(getShoppingBasket(products));
        double priceOzon = price;
        double priceAmazon = price;
        double priceAlibaba = price;

        for (int i = 0; i < shoppingBasket.length; i++){
            priceOzon += shoppingBasket[i].getWeightProduct() * order1.getDeliveryWeightPrice();
            priceAmazon += shoppingBasket[i].getWeightProduct() * order2.getDeliveryWeightPrice();
            priceAlibaba += shoppingBasket[i].getWeightProduct() * order3.getDeliveryWeightPrice();
        }

        double array [] = {order1.getRiskLoss(), order2.getRiskLoss(), order3.getRiskLoss()};
        double min = array[0];


        if (price > 10000){
            for (int i = 0; i < array.length; i++){
                if (min > array[i]){
                    min = array[i];
                }
            }
            System.out.println("ывалдывоалдываоваоывл");
        }
    }


    }










