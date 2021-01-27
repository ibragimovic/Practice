package com.company;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit(123, 10250, "12 months", 25);
        Credit credit2 = new Credit(236, 8700, "12 months", 30);
        Credit credit3 = new Credit(288, 28000, "12 months", 23);
        Credit credit4 = new Credit(566, 40000, "12 months", 22);
        Credit credit5 = new Credit(983, 120001, "12 months", 30);


        System.out.println("Количество выданных кредитов: " + Credit.getNumLoansIssued());
        System.out.println("Общая сумма выданных кредитов: " + Credit.getTotalAmountLoansIssued());
        System.out.println("Средняя сумма кредитов: " + Credit.getTotalAmountLoansIssued()/Credit.getNumLoansIssued());

    }
}
