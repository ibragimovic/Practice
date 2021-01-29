package com.company;

public class OnlineStrore {
    private double deliveryWeightPrice;
    private int deliveryTime;
    private int taxValue;
    private int riskLoss;



    public OnlineStrore() {}

    public OnlineStrore(double deliveryWeightPrice, int deliveryTime, int taxValue, int riskLoss) {
        this.deliveryWeightPrice = deliveryWeightPrice;
        this.deliveryTime = deliveryTime;
        this.taxValue = taxValue;
        this.riskLoss = riskLoss;

    }

    public double getDeliveryWeightPrice() {
        return deliveryWeightPrice;
    }

    public void setDeliveryWeightProducts(double ddeliveryWeightPrice) {
        this.deliveryWeightPrice = deliveryWeightPrice;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(int taxValue) {
        this.taxValue = taxValue;
    }

    public int getRiskLoss() {
        return riskLoss;
    }

    public void setRiskLoss(int riskLoss) {
        this.riskLoss = riskLoss;
    }

    public void setDeliveryWeightPrice(double deliveryWeightPrice) {
        this.deliveryWeightPrice = deliveryWeightPrice;
    }


}
