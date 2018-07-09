package com.yr.JavaCoreProject.tasks.polymorphism;

import java.util.Objects;

public class Product {
    private String productName;
    private double productPrice;
    private Category productCategory;

    public Product(String productName, double price, Category productCategory) {
        this.productName = productName;
        this.productPrice = price;
        this.productCategory = productCategory;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public  double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productPrice, productPrice) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productCategory, product.productCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productCategory);
    }

}

