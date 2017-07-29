package com.jft;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rramalingam on 16/07/2017.
 */
public class MyFirstTest {
    @Test
    public void canAddTwoNumbers(){

        int answer=2+2;
        assertEquals("checck 2+2",answer,4);

    }
    @Test
public void aJavaDocComment(){
        assertTrue(addTwoNumbers(4,3)==7);
    }
    /**
     * Add two integers and return an int.
     *
     * There is a risk of overflow since two big
     * integers would max out the return int.
     *
     * @param a is the first number to add
     * @param b is the second number to add
     * @return a+b as an int
     */
    public int addTwoNumbers(int a, int b) {
    return a+b;
    }
}
