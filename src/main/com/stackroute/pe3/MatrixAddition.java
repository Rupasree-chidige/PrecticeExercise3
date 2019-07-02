package com.stackroute.pe3;

public class MatrixAddition {
    public static int[][] additionOfTwoMatrices(int rowSize, int columnSize, int[][] matrix1, int[][] matrix2) {
        int[][] output = new int[rowSize][columnSize];
        int matrix1Row= matrix1.length;
        int matrix1Col = matrix1[0].length;
        int matrix2Row=matrix2.length;
        int matrix2Col=matrix2[0].length;

            if (matrix1Row == matrix2Row && matrix1Col == matrix2Col) {
                try {
                    for (int i = 0; i < rowSize; i++) {
                        for (int j = 0; j < columnSize; j++) {
                            output[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }

                    return output;

                }catch (Exception e)
                {

                }

            }
      return null;
    }
}
