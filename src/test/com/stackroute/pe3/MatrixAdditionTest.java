package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    int[][] expectedResult;
    int[][] actualResult;
    @Before
    public void setUp(){

        matrixAddition=new MatrixAddition();
    }
    @Test
    public void givenMultiDimensionalMatrixReturnsSum(){
        int[][] matrix1 = {{1,2,},{3,4},{5,6}};
        int[][] matrix2 = {{9,8,},{7,6},{5,4}};
        int[][] result  = {{10,10},{10,10},{10,10}};

        actualResult=matrixAddition.additionOfTwoMatrices(3,2,matrix1,matrix2);
        expectedResult= result;
        assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void givenIncompatableMultiDimensionalMatrixReturnsIncompatable(){
        int[][] matrix1 = {{1,2,},{3,4},{5,6}};
        int[][] matrix2 = {{9,8,},{7,6}};
        int[][] result  = null;

        actualResult=matrixAddition.additionOfTwoMatrices(3,2,matrix1,matrix2);
        expectedResult= result;
        assertNull("Incompatable arrays to add",result);
    }

    @After
    public void tearDown(){
        matrixAddition=null;
    }

}