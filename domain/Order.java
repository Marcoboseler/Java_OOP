package com.acme.domain;
import com.acme.utils.MyDate;

public class Order {

    private MyDate orderDate;
    private double orderAmount = 0.00;
    private String customer;
    private Good product;
    private int quantity;
    private static double taxRate = 0.05;

    public static void setTaxRate(double newRate) {
        taxRate = newRate;
    }

    public static void computeTaxOn(double anAmount) {
        System.out.println("The tax for " + anAmount + " is: " + anAmount* Order.getTaxRate());
    }

    public Order(MyDate d, double amount, String c, Good p, int q) {
        setOrderDate(d);
        setOrderAmount(amount);
        setCustomer(c);
        setProduct(p);
        setQuantity(q);
    }

    public static double getTaxRate() {
        return taxRate;
    }

    public String toString() {
        return getQuantity() + " ea. " + getProduct() + " for " + getCustomer();
    }

    public double computeTax() {
        System.out.println("The tax for this order is: " + getOrderAmount() * Order.getTaxRate());
        return getOrderAmount() * Order.getTaxRate();
    }

    public double computeTotal() {
        double total = getOrderAmount();
        switch(jobSize()){
            case 'M': total -= getOrderAmount() * 0.01;
            break;
            case 'L': total -= getOrderAmount() * 0.02;
            break;
            case 'X': total -= getOrderAmount() * 0.03;
            break;
        }
        if(getOrderAmount() <= 1500){
            total = total + computeTax();
        }
        return total;
    }

    public char jobSize() {
        if(getQuantity() <= 25){
            return 'S';
        }else if(getQuantity() <=75) {
            return 'M';
        }else if(getQuantity() <= 150) {
            return 'L';
        }
        return 'X';
    }


    public MyDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(MyDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        if(orderAmount >= 0)
            this.orderAmount = orderAmount;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Good getProduct() {
        return product;
    }

    public void setProduct(Good product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
    }
}
