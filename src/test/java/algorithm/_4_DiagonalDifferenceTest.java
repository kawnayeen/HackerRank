package algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 4/9/18
 */
public class _4_DiagonalDifferenceTest {
    @Test
    public void testDiagonalDifference() {
        int[][] squareArr = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        Assert.assertEquals(15, new _4_DiagonalDifference().diagonalDifference(squareArr));
    }
}