package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Check7ConsecutiveNumbersTest {

    Check7ConsecutiveNumbers check7ConsecutiveNumbers;
    @Before
    public void setUp(){
        check7ConsecutiveNumbers=new Check7ConsecutiveNumbers();
    }
    @Test
    public void givenIntegerArrayReturnsItIsConsecutive(){
        String result=check7ConsecutiveNumbers.checkConsecutive(new int[]{1,2,3,4},3);
        assertEquals(" 1,2,3,4, are consecutive",result);
    }
    @Test
    public void givenIntegerArrayReturnsItIsNotConsecutive(){
        String result=check7ConsecutiveNumbers.checkConsecutive(new int[]{1,2,3,6,8},4);
        assertEquals(" 1,2,3,6,8 are not consecutive",result);
    }
    @After
    public void tearDown(){
        check7ConsecutiveNumbers=null;
    }


}