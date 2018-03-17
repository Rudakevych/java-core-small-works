package com.yr.JavaCoreProject.calculator;

public class TheBiggestValue {

    /**
     * Searched one the biggest Integer value from three numbers
     *
     * @param numberOne
     * @param numberTwo
     * @param numberThree
     */
    public void biggestValue(int numberOne, int numberTwo, int numberThree) {

        if (numberOne > numberTwo)
            System.out.println("First number - " + numberOne + " is biggest");
        else if (numberThree > numberTwo)
            System.out.println("Third number - " + numberThree + " is biggest");
        else
            System.out.println("Second number - " + numberTwo + " is biggest");
    }
}
