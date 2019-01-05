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
     * Gets the column specified with the given columnIndex from the given matrix
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


    /**
     * Calculates the sum of two specified vectors
     * @param vector1 the first specified vector
     * @param vector2 the second specified vector
     * @return a vector representing the sum of the two specified vectors
     * @throws IllegalArgumentException if one or more vectors are invalid based on the
     *         areTwoVectorsValid() method.
     */
    public double[] addTwoVectors(double [] vector1, double [] vector2) {

        //Ensure that the two vectors have equal length
        if (!areTwoVectorsValid(vector1, vector2))
            throw new IllegalArgumentException("Invalid vectors.");

        double [] sum = new double[vector1.length];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = vector1[i] + vector2[i];
        }
        return sum;
    }


    /**
     * Calculates the dot product of two specified vectors
     * @param vector1 the first specified vector
     * @param vector2 the second specified vector
     * @return the dot product of the vectors
     * @throws IllegalArgumentException if the vectors are invalid based on the
     * areTwoVectorsValid(double[], double[]) method
     */
    public double getDotProductOfTwoVectors(double [] vector1, double [] vector2) {
        //Ensure that the two vectors have equal length
        if (!areTwoVectorsValid(vector1, vector2))
            throw new IllegalArgumentException("Invalid vectors.");

        double result = 0;

        for (int i = 0; i < vector1.length; i++) {
            result += vector1[i] * vector2[i];
        }
        return result;
    }

}
