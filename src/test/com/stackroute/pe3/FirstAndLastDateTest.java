package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstAndLastDateTest {
   FirstAndLastDate firstAndLastDate;

    @Before
    public void setup() {
        System.out.println("Before");
        firstAndLastDate = new FirstAndLastDate();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        firstAndLastDate = null;
    }


    @AfterClass
    public static void tearDownAfterClass() {

        System.out.println("AfterClass");
    }

    @Test
    public void givenNotingShouldReturnLastAndFirstDateOfWeek() {
        String result =firstAndLastDate.FirstAndLastOfWeek();
        assertEquals("Mon 01/07/2019\n" + "Sun 07/07/2019",result);
    }



}