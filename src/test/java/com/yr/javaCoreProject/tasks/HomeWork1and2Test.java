package com.yr.javaCoreProject.tasks;

import com.yr.JavaCoreProject.tasks.HomeWork1and2;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class HomeWork1and2Test {

    @Test
    public void userWithTheBiggestSalaryTest() {
        DataProvider dataProvider = new DataProvider();
        ArrayList generatingUsers = dataProvider.generatingUsers();

        HomeWork1and2 homeWork1and = new HomeWork1and2();
        System.out.println(homeWork1and.userWithTheBiggestSalary(generatingUsers));
    }


}
