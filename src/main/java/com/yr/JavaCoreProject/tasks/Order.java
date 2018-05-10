package com.yr.JavaCoreProject.tasks;

import java.util.Date;

public class Order {

    private String name;
    private int number;
    private Product product;
    private String date;

    public Order(String name, int number, Product product, String date) {
        this.name = name;
        this.number = number;
        this.product = product;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", product=" + product +
                ", date=" + date +
                '}';
    }
}
