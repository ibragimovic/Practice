package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Products product1 = new Products("Notebook - Apple", 3.6, 120000);
        Products product2 = new Products("Notebook - Acer", 4.5, 40000);
        Products product3 = new Products("Phone - iPhone10", 0.3, 80000);
        Products product4 = new Products("Book", 0.8, 6000);
        Products product5 = new Products("Keyboard-Delux", 0.3, 800);
        Products product6 = new Products("E-Reader", 0.7, 8500);

        Products [] products = {product1, product2, product3, product4, product5, product6};

        double countWeight = 0;
        for (Products product : products) {
            countWeight += product.getWeightProduct();
        }





//        OnlineStrore ozon = new OnlineStrore("OZON", products, )




    }
}
