package com.yr.JavaCoreProject.calculator;

public class SortTheValues {

    /**
     * Sorting of two values in array
     *
     * @param array
     */
    public void sortTwoFirstValuesinArray(int[] array) {
        int value = 0;

        if (array[0] > array[1]) {
            value = array[0];
            array[0] = array[1];
            array[0] = value;
        }
    }

    /**
     * Sorting of three values in array
     *
     * @param array
     */
    public void sortThreeValuesInArray(int[] array) {
        int valueTwo = 0;
        int value = 0;

        if (array[0] > array[1]) {
            value = array[0];
            array[0] = array[1];
            array[0] = value;
        }

        if (array[1] > array[2]) {
            valueTwo = array[1];
            array[1] = array[2];
            array[2] = valueTwo;
        }
    }

    /**
     * Sorting of four values in array
     *
     * @param array
     */
    public void sortFourthValuesInArray(int[] array) {
        int value3 = 0;
        int valueTwo = 0;
        int value = 0;

        if (array[0] > array[1]) {
            value = array[0];
            array[0] = array[1];
            array[0] = value;
        }

        if (array[1] > array[2]) {
            valueTwo = array[1];
            array[1] = array[2];
            array[2] = valueTwo;
        }

        if (array[2] > array[3]) {
            value3 = array[2];
            array[2] = array[3];
            array[2] = value3;
        }
    }
}
