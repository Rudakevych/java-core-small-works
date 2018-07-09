package com.yr.JavaCoreProject.tasks.polymorphism;

import java.util.Objects;

public class Category {
    private String productCategoryName;

    public Category(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Category() {
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "productCategoryName='" + productCategoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(productCategoryName, category.productCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoryName);
    }
}
