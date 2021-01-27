package com.company;

public class Credit {
    private int id;
    private int sum;
    private String periodMonth;
    private int interestRate;
    private static int numLoansIssued;
    private static double totalAmountLoansIssued;
    private static double averageLoans;

    public Credit(int id, int sum, String periodMonth, int interestRate){
        this.id = id;
        this.sum = sum;
        this.periodMonth = periodMonth;
        this.interestRate = interestRate;
        numLoansIssued++;
        totalAmountLoansIssued += sum;
        averageLoans = totalAmountLoansIssued/numLoansIssued;
    }

    public static int getNumLoansIssued(){
        return numLoansIssued;
    }

    public static double getTotalAmountLoansIssued(){
        return totalAmountLoansIssued;
    }

    public static double getAverageLoans(){
        return averageLoans;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriodMonth() {
        return periodMonth;
    }

    public void setPeriodMonth(String periodMonth) {
        this.periodMonth = periodMonth;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
