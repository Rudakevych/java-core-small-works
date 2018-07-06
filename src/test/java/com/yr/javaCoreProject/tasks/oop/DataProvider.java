package com.yr.javaCoreProject.tasks.oop;

import com.yr.JavaCoreProject.tasks.oop.Category;
import com.yr.JavaCoreProject.tasks.oop.Order;
import com.yr.JavaCoreProject.tasks.oop.Product;
import com.yr.JavaCoreProject.tasks.oop.User;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class DataProvider {

    public ArrayList generatingUsers() {

        ArrayList orders = new ArrayList();
        orders.add(new Order("Order Three", 3, new Product("ProductName3", 300, new Category("Third Category")),new GregorianCalendar(2018, 2, 15)));
        orders.add(new Order("Order Two", 2, new Product("ProductName2", 200, new Category("Second Category")),new GregorianCalendar(2016, 3, 1)));
        orders.add(new Order("Order One", 1, new Product("ProductName1", 100, new Category("First Category")),new GregorianCalendar(2017, 4, 15)));

        ArrayList listOfUsers = new ArrayList();
        listOfUsers.add(new User("Petro", "Ivanovych", 56, 100.25, (ArrayList<Order>) orders.get(0), 2));
        listOfUsers.add(new User("Ivan", "Grygorovych", 67, 1056,(ArrayList<Order>) orders.get(1) , 0));
        listOfUsers.add(new User("Stepan", "Savka", 89, 888, (ArrayList<Order>) orders.get(2), 100));

        return listOfUsers;
    }
}