package com.stackroute.pe3;

public class ChessBoard {
    public String[][] PrintChessBoard()

    {
        String board[][] = new String[8][8];
        String str = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        board[i][j] = "WW|";

                    } else {
                        board[i][j] = "BB|";
                    }
                } else {
                    if (j % 2 == 0)
                        board[i][j] = "BB|";
                    else
                        board[i][j] = "WW|";
                }


            }
        }
        return board;
    }
}



