package com.cherifcodes.matrixArtithmetics;

/**
 * Contains methods for performing basic vector and matrix calculations
 */
public class MatrixCalculator {

    /**
     * Determines whether two given vectors are valid by ensuring that neither is null, they have
     * equal length that is greater than 0.
     * @param vector1 first vector
     * @param vector2 second vector
     * @return true if both vectors are valid, false otherwise
     */
    public boolean areTwoVectorsValid(double [] vector1, double [] vector2) {
        return (vector1 != null &&
                vector2 != null &&
                vector1.length > 0 &&
                vector1.length == vector2.length);
    }

    /**
     * Gets the column specified with the given columnIndex from the give matrix
     * @param matrix the given 2D matrix
     * @param columnIndex the specified column index
     * @return an array containing the values of the specified column
     */
    public static double [] getMatrixColumn(double [][] matrix, int columnIndex) {

        //Ensure that the columnIndex and the matrix are valid
        if (columnIndex < 0 || matrix == null || matrix.length < 1 || columnIndex >= matrix[0].length)
            throw new IllegalArgumentException("Invalid arguments");

        double [] column = new double[matrix.length];

        for (int i = 0; i < column.length; i++) {
            column[i] = matrix[i][columnIndex];
        }
        return column;
    }

}
