package com.yr.javaCoreProject.calculator;

import com.yr.JavaCoreProject.calculator.TheBiggestValue;
import org.junit.Test;

public class TheBiggestValueTest {
    TheBiggestValue theBiggestValue = new TheBiggestValue();

    @Test
    public void biggestValuePositiveTest() {
        theBiggestValue.biggestValue(367, 333, 45);
    }
}


