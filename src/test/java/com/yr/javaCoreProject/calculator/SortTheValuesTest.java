package com.yr.javaCoreProject.calculator;

import com.yr.JavaCoreProject.calculator.SortTheValues;
import org.junit.Test;

public class SortTheValuesTest {

    int[] arrayOfValues = {34, 5, 6, 8};
    SortTheValues sortClass = new SortTheValues();

    @Test
    public void sortTwoValues() {
        sortClass.sortTwoFirstValuesinArray(arrayOfValues);
    }

    @Test
    public void sortThreeValues() {
        sortClass.sortThreeValuesInArray(arrayOfValues);
    }

    @Test
    public void sortFourValues() {
        sortClass.sortFourthValuesInArray(arrayOfValues);
    }
}
