package com.yr.JavaCoreProject.calculator;

public class SequentialSearch {
    /**
     * Simple sequential method.
     * checking is element in array or not.
     * if element finded in array - return 1
     * if element was not finded - return -1
     *
     * @param array
     * @param index
     * @return
     */
    public static int sequentialSearchMethod(int[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == array[index]) {
                return i;
            }
        }
        return -1;
    }
}
