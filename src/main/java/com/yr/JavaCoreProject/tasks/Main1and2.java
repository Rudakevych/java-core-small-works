package com.yr.JavaCoreProject.tasks;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.ArrayList;
import java.util.Date;

public class Main1and2 {
    /**
     * Написать методы:
     * - для нахождения пользователя с самой большой зарплатой
     * - для нахождения пользователей в заданном интервале лет(от и до)
     * - для нахождения суммарной цены по всем заказам пользователя
     * - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
     * <p>
     * - для нахождения купленных товаров пользователя по заданной категории
     * - для нахождения заданного количества самых дорогих заказов пользователя
     */

    // - для нахождения пользователя с самой большой зарплатой
    public User userWithTheBiggestSalary(ArrayList listOfUsers) {
        User simpleUser;
        User userWithTheBiggestSalary = (User) listOfUsers.get(0);
        for (int i = 0; i < listOfUsers.size(); i++) {
            simpleUser = (User) listOfUsers.get(i);
            if (userWithTheBiggestSalary.getSalary() <= simpleUser.getSalary()) {
                userWithTheBiggestSalary.setSalary(simpleUser.getSalary());
            }
        }
        return userWithTheBiggestSalary;
    }

    // - для нахождения пользователей в заданном интервале лет(от и до)
    public ArrayList findUserByAgeDiapazon(ArrayList listOfUsers, int fromAge, int toAge) {
        ArrayList listOfUsersWhoHaveAgeInDiapazon = new ArrayList();
        User userWithTheCorrectAge = (User) listOfUsers.get(0);
        for (int i = 0; i < listOfUsers.size(); i++) {
            if (userWithTheCorrectAge.getAge() >= fromAge && userWithTheCorrectAge.getAge() <= toAge) {
                listOfUsersWhoHaveAgeInDiapazon.add(userWithTheCorrectAge);
            }
        }
        return listOfUsersWhoHaveAgeInDiapazon;
    }

    // - для нахождения суммарной цены по всем заказам пользователя
    public double getAllOrdersPrice(User user) {
        double allOrdersPrice = 0;
        for (int i = 0; i < user.getOrders().size(); i++) {
            allOrdersPrice += user.getOrders().get(i).getProduct().getPrice();
        }
        return allOrdersPrice;
    }

    // - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
    public double getAllOrdersPriceAndDate(User user, Date fromDate, Date toDate) {
        double allOrdersPrice = 0;
        for (int i = 0; i < user.getOrders().size(); i++) {
//            if (user.getOrders().get(i).getDate() ) {
//                allOrdersPrice += user.getOrders().get(i).getProduct().getPrice();
//            }
        }
        return allOrdersPrice;
    }
}
