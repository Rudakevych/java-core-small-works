package com.yr.javaCoreProject.tasks;

import com.yr.JavaCoreProject.tasks.Category;
import com.yr.JavaCoreProject.tasks.Order;
import com.yr.JavaCoreProject.tasks.Product;
import com.yr.JavaCoreProject.tasks.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataProvider {

    public ArrayList generatingUsers() {

        DateFormat simplaDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        ArrayList orders = new ArrayList();
        orders.add(new Order("Order Three", 3, new Product("ProductName3", 300, new Category("Third Category")),simplaDateFormat.format(date)));
        orders.add(new Order("Order Two", 2, new Product("ProductName2", 200, new Category("Second Category")),simplaDateFormat.format(date)));
        orders.add(new Order("Order One", 1, new Product("ProductName1", 100, new Category("First Category")),simplaDateFormat.format(date)));

        ArrayList listOfUsers = new ArrayList();
        listOfUsers.add(new User("Petro", "Ivanovych", 56, 100.25, (ArrayList<Order>) orders.get(0), 2));
        listOfUsers.add(new User("Ivan", "Grygorovych", 67, 1056,(ArrayList<Order>) orders.get(1) , 0));
        listOfUsers.add(new User("Stepan", "Savka", 89, 888, (ArrayList<Order>) orders.get(2), 100));

        return listOfUsers;
    }
}
