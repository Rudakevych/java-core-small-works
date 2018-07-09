package com.yr.javaCoreProject.tasks.oop;

import com.yr.JavaCoreProject.tasks.polymorphism.Category;
import com.yr.JavaCoreProject.tasks.polymorphism.Order;
import com.yr.JavaCoreProject.tasks.polymorphism.Product;
import com.yr.JavaCoreProject.tasks.polymorphism.User;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class DataProvider {

    /**
     * Created list of Orders for tests
     *
     * @return list of Orders
     */
    public ArrayList<Order> ordersList() {
        ArrayList<Order> orders = new ArrayList<Order>();

        orders.add(new Order("Order One", 1,
                new Product("ProductName1", 100,
                        new Category("First Category")),
                new GregorianCalendar(2017, 4, 15)));
        orders.add(new Order("Order Three", 3,
                new Product("ProductName3", 300,
                        new Category("Third Category")),
                new GregorianCalendar(2018, 2, 15)));
        orders.add(new Order("Order Two", 2,
                new Product("ProductName2", 200,
                        new Category("Second Category")),
                new GregorianCalendar(2016, 3, 1)));

        return orders;
    }

    /**
     * Created list of Users for tests
     *
     * @return list of Users
     */
    public ArrayList<User> generatingUsers() {
        ArrayList<User> listOfUsers = new ArrayList<User>();

        listOfUsers.add(new User("Petro", "Ivanovych", 56, 100.25, ordersList(), 2));
        listOfUsers.add(new User("Ivan", "Grygorovych", 67, 1056, ordersList(), 0));
        listOfUsers.add(new User("Stepan", "Savka", 89, 888, ordersList(), 100));

        return listOfUsers;
    }
}
