package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _42_3DSurfaceAreaTest {

    @Test
    public void surfaceArea() {
        int[][] input = {
                {1, 3, 4},
                {2, 2, 3},
                {1, 2, 4}
        };
        _42_3DSurfaceArea surfaceArea = new _42_3DSurfaceArea();
        Assert.assertEquals(60, surfaceArea.surfaceArea(input));
    }

    @Test
    public void testSingleRowColumn() {
        int[][] input = {
                {2}

        };
        _42_3DSurfaceArea surfaceArea = new _42_3DSurfaceArea();
        Assert.assertEquals(10, surfaceArea.surfaceArea(input));
    }

    @Test
    public void testSingleRowMultipleColumn() {
        int[][] input = {
                {1, 2, 1}
        };
        _42_3DSurfaceArea surfaceArea = new _42_3DSurfaceArea();
        Assert.assertEquals(18, surfaceArea.surfaceArea(input));

        int[][] inputTwo = {
                {1, 4, 1}
        };
        Assert.assertEquals(26, surfaceArea.surfaceArea(inputTwo));
    }

    @Test
    public void testMultipleRowSingleColumn() {
        int[][] input = {
                {51},
                {32},
                {28},
                {49},
                {28},
                {21},
                {98},
                {56},
                {99},
                {77}
        };
        _42_3DSurfaceArea surfaceArea = new _42_3DSurfaceArea();
        Assert.assertEquals(1482, surfaceArea.surfaceArea(input));
    }

    @Test
    public void testDoubleRowDoubleColumn() {
        int[][] input = {
                {1, 2},
                {2, 1}
        };
        _42_3DSurfaceArea surfaceArea = new _42_3DSurfaceArea();
        Assert.assertEquals(24, surfaceArea.surfaceArea(input));

    }
}