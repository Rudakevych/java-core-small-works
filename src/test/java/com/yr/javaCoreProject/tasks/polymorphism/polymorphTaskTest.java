package com.yr.javaCoreProject.tasks.polymorphism;

import com.yr.JavaCoreProject.tasks.polymorphism.PolymorphTask;
import com.yr.JavaCoreProject.tasks.polymorphism.User;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class polymorphTaskTest {

    DataProvider dataProvider = new DataProvider();
    ArrayList<User> generatingUsers = dataProvider.generatingUsers();
    PolymorphTask polymorphTask = new PolymorphTask();

    @Test
    public void userWithTheBiggestSalaryTest() {
        System.out.println(polymorphTask.userWithTheBiggestSalary(generatingUsers));
    }

    @Test
    public void findUserByAgeRangeTest() {
        System.out.println("Users in range: "
                + polymorphTask.findUserByAgeRange(generatingUsers, 40, 60).size());
    }

    @Test
    public void getAllOrdersPriceTest() {
        System.out.println("Prise of all user's orders: "
                + polymorphTask.getAllOrdersPrice(generatingUsers.get(0)));
    }

    @Test
    public void getAllOrdersPriceAndDateTest() {
        // TODO: 7/8/18 Something wrong with date formating
        System.out.println("Prise of all user's orders: "
                + polymorphTask.getAllOrdersPriceAndDate(generatingUsers.get(1),
                new GregorianCalendar(2000, 1, 1),
                new GregorianCalendar(2018, 12, 1)));
    }

    @Test
    public void getAProductByCategoryTest() {
        System.out.println("Products with category name what was buyed: "
                + polymorphTask.getAProductByCategory(generatingUsers.get(2), "Third Category"));
    }

    @Test
    public void numberOfTheMoustBiggerCoastOrderTest() {
        // TODO: 2018-07-09 Hmmmmmm... Smth wrong with sorting...
        System.out.println("The biggest orders are: "
                + polymorphTask.numberOfTheMoustBiggerCoastOrder(generatingUsers.get(1), 1));
    }
}
