package com.company;
class product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public product(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
    }

    public product(String itemNo, String name, double price, int qty) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
public class AB_S11_117_OOPs_Constructor_SCProductCustomer {
    public static void main(String[] args) {

    }
}
