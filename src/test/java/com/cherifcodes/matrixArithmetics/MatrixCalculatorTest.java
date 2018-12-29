package com.cherifcodes.matrixArithmetics;

import com.cherifcodes.matrixArtithmetics.MatrixCalculator;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MatrixCalculatorTest {

    @Test
    public void testAreTwoVectorsValid(){
        //Test two null vectors
        double [] v1 = null;
        double [] v2 = null;
        MatrixCalculator matrixCalculator = new MatrixCalculator();
        assertFalse(matrixCalculator.areTwoVectorsValid(v1, v2));

        //Test one null vector
        v1 = new double[]{1,2};
        v2 = null;
        assertFalse(matrixCalculator.areTwoVectorsValid(v1, v2));

        //Test two empty vectors
        v1 = new double[]{};
        v2 = new double[]{};
        assertFalse(matrixCalculator.areTwoVectorsValid(v1, v2));

        //Test one empty vector
        v1 = new double[]{1,2};
        v2 = new double[]{};
        assertFalse(matrixCalculator.areTwoVectorsValid(v1, v2));

        //Test normal, unequal vectors
        v1 = new double[]{1,2};
        v2 = new double[]{1,2,3};
        assertFalse(matrixCalculator.areTwoVectorsValid(v1, v2));

        //Test valid vectors
        v1 = new double[]{1,2,9};
        v2 = new double[]{1,2,3};
        assertTrue(matrixCalculator.areTwoVectorsValid(v1, v2));
    }
}
