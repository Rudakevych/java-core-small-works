package com.yr.javaCoreProject.calculator;

import com.yr.JavaCoreProject.calculator.IsNumberEven;
import org.junit.Test;

public class IsNumberEvenTest {
    IsNumberEven isNumberEvenclass = new IsNumberEven();

    @Test
    public void evenValue() {
        isNumberEvenclass.isNumberIven(22, 4);
    }

    @Test
    public void notEvenValue() {
        isNumberEvenclass.isNumberIven(3, 45);
    }
}
