package com.yr.javaCoreProject.tasks.oop;

import com.yr.JavaCoreProject.tasks.oop.Main1and2;
import com.yr.JavaCoreProject.tasks.oop.User;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class HomeWork1and2Test {

    DataProvider dataProvider = new DataProvider();
    ArrayList<User> generatingUsers = dataProvider.generatingUsers();
    Main1and2 homeWork1and = new Main1and2();

    GregorianCalendar fromDate = new GregorianCalendar(2000, 1, 1);
    GregorianCalendar toDate = new GregorianCalendar(2018, 12, 1);

    @Test
    public void userWithTheBiggestSalaryTest() {
        System.out.println(homeWork1and.userWithTheBiggestSalary(generatingUsers));
    }

    @Test
    public void findUserByAgeRangeTest() {
        System.out.println("Users in range: "
                + homeWork1and.findUserByAgeRange(generatingUsers, 10, 200).size());
    }

    @Test
    public void getAllOrdersPriceTest() {
        System.out.println("Prise of all user's orders: "
                + homeWork1and.getAllOrdersPrice(generatingUsers.get(0)));
    }

    @Test
    public void getAllOrdersPriceAndDateTest() {
        // TODO: 7/8/18 Something wrong with date formating
        System.out.println("Prise of all user's orders: "
                + homeWork1and.getAllOrdersPriceAndDate(generatingUsers.get(1), fromDate, toDate));
    }

    @Test
    public void getAProductByCategoryTest() {
        System.out.println("Products with category name what was buyed: "
                + homeWork1and.getAProductByCategory(generatingUsers.get(2), "Third Category"));
    }

    @Test
    public void numberOfTheMoustBiggerCoastOrderTest() {
        System.out.println("The biggest orders are: "
                + homeWork1and.numberOfTheMoustBiggerCoastOrder(generatingUsers.get(1), 1));
    }
}
