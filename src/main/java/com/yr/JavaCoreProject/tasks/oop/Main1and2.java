package com.yr.JavaCoreProject.tasks.oop;

import java.util.*;

public class Main1and2 {
    /**
     * Написать методы:
     * - для нахождения пользователя с самой большой зарплатой
     * - для нахождения пользователей в заданном интервале лет(от и до)
     * - для нахождения суммарной цены по всем заказам пользователя
     * - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
     * - для нахождения купленных товаров пользователя по заданной категории
     * - для нахождения заданного количества самых дорогих заказов пользователя
     */

    /** Метод для нахождения пользователя с самой большой зарплатой */
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

    /** Метод для нахождения пользователей в заданном интервале лет(от и до) */
    public ArrayList<User> findUserByAgeDiapazon(ArrayList<User> listOfUsers, int fromAge, int toAge) {
        ArrayList listOfUsersWhoHaveAgeInDiapazon = new ArrayList();
        User userWithTheCorrectAge = (User) listOfUsers.get(0);
        for (int i = 0; i < listOfUsers.size(); i++) {
            if (userWithTheCorrectAge.getAge() >= fromAge && userWithTheCorrectAge.getAge() <= toAge) {
                listOfUsersWhoHaveAgeInDiapazon.add(userWithTheCorrectAge);
            }
        }
        return listOfUsersWhoHaveAgeInDiapazon;
    }

    /** Метод для нахождения суммарной цены по всем заказам пользователя */
    public double getAllOrdersPrice(User user) {
        double allOrdersPrice = 0;
        for (int i = 0; i < user.getOrders().size(); i++) {
            allOrdersPrice += user.getOrders().get(i).getProduct().getPrice();
        }
        return allOrdersPrice;
    }

    /** Метод для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date) */
    public double getAllOrdersPriceAndDate(User user, GregorianCalendar fromDate, GregorianCalendar toDate) {
        double allOrdersPrice = 0;
        for (int i = 0; i < user.getOrders().size(); i++) {
            if (user.getOrders().get(i).getDate().before(fromDate)  && user.getOrders().get(i).getDate().after(toDate)) {
                allOrdersPrice += user.getOrders().get(i).getProduct().getPrice();
            }
        }
        return allOrdersPrice;
    }

    /** Метод для нахождения купленных товаров пользователя по заданной категории */
    public ArrayList<Product> getAProductByCategory(ArrayList<User> listOfUsers, String productCatogoryName){
        ArrayList listOfProductsWithNeededCategory = new ArrayList();
        for (int i = 0; i < listOfUsers.size(); i++) {
            for (int j = 0; j < listOfUsers.get(i).getOrders().size(); j++) {
                if (listOfUsers.get(i).getOrders().get(i).getName().equals(productCatogoryName)) {
                    listOfProductsWithNeededCategory.add(listOfUsers.get(i).getOrders().get(j).getProduct());
                }
            }
        }
        return listOfProductsWithNeededCategory;
    }

    /** Метод для нахождения заданного количества самых дорогих заказов пользователя */
    public ArrayList<Order> numberOfTheMoustBiggerCoastOrder(User user, int numberOfOrders){
        ArrayList<Order> listOfOrdersWithBiggestPrice = new ArrayList<>();
        for (int i = 0; i < user.getOrders().size(); i++) {
//            user.getOrders().get(i).getProduct().getPrice();
//            listOfOrdersWithBiggestPrice.add(user.getOrders().get(i));
            Comparator<Product> productPriceComparator = new ProductPriceComparator();
            productPriceComparator.compare(user.getOrders().get(i).getProduct(), user.getOrders().get(i+1).getProduct());
        }

        return listOfOrdersWithBiggestPrice;
    }


}
