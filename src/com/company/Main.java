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

        System.out.println("Выберите товар из списка, написав true или false,  и положите в корзину.");

        for (int i = 0; i < products.length; i++){
            System.out.println( products[i]);
        }

        Ozon ozon = new Ozon();
        Amazon amazon = new Amazon();
        Alibaba alibaba = new Alibaba();

        Order order = new Order(ozon, amazon, alibaba, products);

        Products[] basket = order.getShoppingBasket(products);

        System.out.println("Сумма выбранных Вами товаров составит " + order.countPrice(basket) + " без учета доставки.");




















    }
}
