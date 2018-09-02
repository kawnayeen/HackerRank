package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

public class _2_HourGlassTest {
    @Test
    public void testNumberOfHourGlass() {
        int[][] testArr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        Assert.assertEquals(19, new _2_HourGlass().getMaximumHourGlass(testArr));
    }
}