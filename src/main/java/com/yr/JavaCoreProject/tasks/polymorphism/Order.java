package com.yr.JavaCoreProject.tasks.polymorphism;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Order {

    private String name;
    private int number;
    private Product product;
    private GregorianCalendar date;

    public Order(String name, int number, Product product, GregorianCalendar date) {
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

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getNumber() == order.getNumber() &&
                Objects.equals(getName(), order.getName()) &&
                Objects.equals(getProduct(), order.getProduct()) &&
                Objects.equals(getDate(), order.getDate());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getNumber(), getProduct(), getDate());
    }
}
