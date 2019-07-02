package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsDemoTest {
    ExceptionsDemo exceptionsDemo;

    @Before
    public void setUp() {
        exceptionsDemo = new ExceptionsDemo();
    }

    @Test
    public void givenNullStringReturnsNullPointerException()
    {
        String result=exceptionsDemo.checkNullException(null);
        assertEquals("nullPointerException",result);
    }
    @Test
    public void givenIntegerReturnsIndexOutOfBoundException()
    {
        String result=exceptionsDemo.checkOutOfBoundException("rupa");
        assertEquals("index out of bound",result);
    }
    @Test
    public void givenNegativeIntegerReturnsNegativeArrayIndex()
    {
        String result=exceptionsDemo.checkNegativeArraySizeException(-2 );
        assertEquals("Negative Array Size",result);
    }

    @After
    public void tearDown()
    {
        exceptionsDemo=null;
    }


}