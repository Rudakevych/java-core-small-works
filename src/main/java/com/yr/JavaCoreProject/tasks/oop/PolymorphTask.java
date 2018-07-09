package com.yr.JavaCoreProject.tasks.oop;

import java.util.*;

public class PolymorphTask {
    /**
     * Написать методы:
     * - для нахождения пользователя с самой большой зарплатой
     * - для нахождения пользователей в заданном интервале лет(от и до)
     * - для нахождения суммарной цены по всем заказам пользователя
     * - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
     * - для нахождения купленных товаров пользователя по заданной категории
     * - для нахождения заданного количества самых дорогих заказов пользователя
     */

    /**
     * Метод для нахождения пользователя с самой большой зарплатой
     */
    public User userWithTheBiggestSalary(ArrayList<User> listOfUsers) {
        User simpleUser;
        User userWithTheBiggestSalary = listOfUsers.get(0);
        for (int i = 0; i < listOfUsers.size(); i++) {
            simpleUser = listOfUsers.get(i);
            if (userWithTheBiggestSalary.getSalary() <= simpleUser.getSalary()) {
                userWithTheBiggestSalary.setSalary(simpleUser.getSalary());
            }
        }
        return userWithTheBiggestSalary;
    }

    /**
     * Метод для нахождения пользователей в заданном интервале лет(от и до)
     */
    public ArrayList<User> findUserByAgeRange(ArrayList<User> listOfUsers, int fromAge, int toAge) {
        ArrayList<User> listOfUsersWhoHaveAgeInRange = new ArrayList();
        for (int i = 0; i < listOfUsers.size(); i++) {
            if (listOfUsers.get(i).getAge() >= fromAge || listOfUsers.get(i).getAge() <= toAge){
                listOfUsersWhoHaveAgeInRange.add(listOfUsers.get(i));
            }
        }
        return listOfUsersWhoHaveAgeInRange;
    }

    /**
     * Метод для нахождения суммарной цены по всем заказам пользователя
     */
    public double getAllOrdersPrice(User user) {
        double allOrdersPrice = 0;
        for (int i = 0; i < user.getOrders().size(); i++) {
            allOrdersPrice += user.getOrders().get(i).getProduct().getProductPrice();
        }
        return allOrdersPrice;
    }

    /**
     * Метод для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
     */
    public double getAllOrdersPriceAndDate(User user, Calendar fromDate, GregorianCalendar toDate) {
        double allOrdersPrice = 0;

        for (int i = 0; i < user.getOrders().size(); i++) {
            if (user.getOrders().get(i).getDate().before(fromDate) && user.getOrders().get(i).getDate().after(toDate)) {
                allOrdersPrice += user.getOrders().get(i).getProduct().getProductPrice();
            }
        }
        return allOrdersPrice;
    }

    /**
     * Метод для нахождения купленных товаров пользователя по заданной категории
     */
    public ArrayList<Product> getAProductByCategory(User user, String productCatogoryName) {
        ArrayList<Product> listOfProductsWithNeededCategory = new ArrayList<Product>();

        for (int j = 0; j < user.getOrders().size(); j++) {
            if (user.getOrders().get(j).getProduct().getProductCategory().getProductCategoryName().equals(productCatogoryName)) {
                listOfProductsWithNeededCategory.add(user.getOrders().get(j).getProduct());
            }
        }
        return listOfProductsWithNeededCategory;
    }


    /**
     * Метод для нахождения заданного количества самых дорогих заказов пользователя
     */
    public ArrayList<Order> numberOfTheMoustBiggerCoastOrder(User user, int numberOfOrders) {
        ArrayList listOfOrdersWithBiggestPrice = user.getOrders();

        Collections.sort(listOfOrdersWithBiggestPrice, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getProduct().getProductPrice(), o2.getProduct().getProductPrice());
            }
        });

        for (int i = 0; i < numberOfOrders; i++) {
            listOfOrdersWithBiggestPrice.get(i);
        }

        return listOfOrdersWithBiggestPrice;
    }


}
