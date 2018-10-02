package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

public class _6_LargestRectangleTest {
    @Test
    public void testOne() {
        int[] input = {1, 2, 3, 4, 5};
        _6_LargestRectangle largestRectangle = new _6_LargestRectangle();
        Assert.assertEquals(9, largestRectangle.largestRectangle(input));
    }

    @Test
    public void testTwo() {
        int[] input = {1, 4, 3, 7, 4, 1, 2};
        _6_LargestRectangle largestRectangle = new _6_LargestRectangle();
        Assert.assertEquals(12, largestRectangle.largestRectangle(input));
    }

    @Test
    public void testThree() {
        int[] input = {11,11,10,10,10};
        _6_LargestRectangle largestRectangle = new _6_LargestRectangle();
        Assert.assertEquals(50, largestRectangle.largestRectangle(input));
    }
}