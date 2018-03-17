package com.yr.JavaCoreProject.calculator;

public class IsNumberEven {

    /**
     * We checking is int number is even or not
     * @param a
     * @param b
     */
    public void isNumberIven(int a, int b) {
        if (a % 2 == 0) {
            int multiplyAB = a * b;
            System.out.println("a * b = " + multiplyAB);
        } else {
            int sumAB = a + b;
            System.out.println("a + b = " + sumAB);
        }
    }
}
