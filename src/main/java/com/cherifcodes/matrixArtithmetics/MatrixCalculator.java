package com.cherifcodes.matrixArtithmetics;

/**
 * Contains method for performing basic vector and matrix calculations
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
}
