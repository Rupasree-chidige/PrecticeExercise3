package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;

    @Before
    public void setup() {
        System.out.println("Before");
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        removeVowels = null;
    }

    @Test
    public void givenStringArrayShouldReturnVowelLessString() {
        String result =removeVowels.removeVowelsInArray(new String[]{"India","United States","Russia"});
        assertEquals("nd\n" + "ntd Stts\n" + "Rss\n",result);
    }
    @Test
    public void givenEmptyArrayShouldReturnEmpty() {
        String result =removeVowels.removeVowelsInArray(new String[]{});
        assertEquals("Empty Array",result);
    }

}