package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckMarksGradeTest {

        CheckMarksGrade checkMarksGrade;
        String actualresult;
        String expectedresult;
        @Before
        public void setUp()throws Exception {
            checkMarksGrade = new CheckMarksGrade();
        }

        @Test
        public void givenIntegerArrayReturnsValidStudentMarks()
        {
            int students=10;
            int[] marks = {98,95,25,12,68,87,72,56,59,45};
            actualresult = checkMarksGrade.validateMarks(students,marks);
            expectedresult = "marks are valid";
            assertEquals(expectedresult,actualresult);
        }
        @Test
        public void givenIntegerArrayReturnsStudentMarksAsInvalid()
        {
            int students=8;
            int[] marks = {10,77,89,50,77,130,40,-78};
            actualresult = checkMarksGrade.validateMarks(students,marks);
            expectedresult = "130 is not valid";
            assertEquals(expectedresult,actualresult);
        }
        @After
        public void tearDown(){
            checkMarksGrade = null;
        }

}