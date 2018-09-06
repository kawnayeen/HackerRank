package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _15_MagicSquareTest {
    @Test
    public void testMagicSquare() {
        int[][] input = {
                {4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}
        };
        _15_MagicSquare magicSquare = new _15_MagicSquare();
        Assert.assertEquals(4, magicSquare.formingMagicSquare(input));
    }

    @Test
    public void testCase4() {
        int[][] input = {
                {2, 2, 7},
                {8, 6, 4},
                {1, 2, 9}
        };
        _15_MagicSquare magicSquare = new _15_MagicSquare();
        Assert.assertEquals(16, magicSquare.formingMagicSquare(input));
    }

    @Test
    public void testCase5() {
        int[][] input = {
                {7, 6, 5},
                {7, 2, 8},
                {5, 3, 4}
        };
        _15_MagicSquare magicSquare = new _15_MagicSquare();
        Assert.assertEquals(18, magicSquare.formingMagicSquare(input));
    }
}