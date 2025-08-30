package com.seu.demo2;

public class Phone {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String s) {
        this.brand = s;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void call() {
        System.out.println("call!!!!!!!!!!!");
    }
}
