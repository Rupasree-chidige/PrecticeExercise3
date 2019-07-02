package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() {
        chessBoard = new ChessBoard();
    }

    @Test
    public void givenMultiDimensionalArrayReturnsChessBoard() {
        String[][] result = chessBoard.PrintChessBoard();
        assertArrayEquals(new String[][]{{"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}
                , {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"},
                {"WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|"}, {"BB|", "WW|", "BB|", "WW|", "BB|", "WW|", "BB|", "WW|"}}, result);
    }
    @After
    public void tearDown(){
        chessBoard=null;
    }

}