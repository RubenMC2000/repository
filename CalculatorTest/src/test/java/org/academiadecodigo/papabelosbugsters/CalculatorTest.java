package org.academiadecodigo.papabelosbugsters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        int expected = 15;
        int result = calculator.sum(10, 5);

        //Because we maybe will use it many time we import static instead of Assert.assertEquals
        assertEquals("can't add negative numbers", expected, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void sumNegativeTest(){
        calculator.sum(-10, 10);
    }

    @Test
    public void subTest(){
        int expected = 15;
        int result = calculator.sub(20, 5);

        assertEquals("can't subtract negative numbers", expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subNegativeTest(){
        calculator.sub(-20 ,5);
    }

    @Test
    public void multTest(){
        int expected = 15;
        int result = calculator.mult(5, 3);

        assertEquals(expected, result);
    }

    @Test
    public void divTest(){
        int expected = 15;
        int result = calculator.div(30, 2);

        assertEquals("can't divide zero for anymore number", expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divZeroTest(){
        calculator.div(0, 30);
    }
}
