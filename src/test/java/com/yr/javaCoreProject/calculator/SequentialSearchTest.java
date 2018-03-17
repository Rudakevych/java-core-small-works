package com.yr.javaCoreProject.calculator;

import com.yr.JavaCoreProject.calculator.SequentialSearch;
import org.junit.Assert;
import org.junit.Test;

public class SequentialSearchTest {
    int[] arrayForTest = {2, 23, 4, 5, 56, 45};
    SequentialSearch sequentialSearch = new SequentialSearch();

    @Test
    public void equentialSearchTheElementInArrayTest() {
        sequentialSearch.sequentialSearchMethod(arrayForTest, 2);
        Assert.assertEquals(arrayForTest[0], 2);
    }
}
