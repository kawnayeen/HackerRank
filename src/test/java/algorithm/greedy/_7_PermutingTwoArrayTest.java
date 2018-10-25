package algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _7_PermutingTwoArrayTest {

    @Test
    public void testOne() {
        _7_PermutingTwoArray permutingTwoArray = new _7_PermutingTwoArray();
        int[] a = {2, 1, 3};
        int[] b = {7, 8, 9};
        Assert.assertEquals("YES", permutingTwoArray.twoArrays(10, a, b));
    }

    @Test
    public void testTwo() {
        _7_PermutingTwoArray permutingTwoArray = new _7_PermutingTwoArray();
        int[] a = {1, 2, 2, 1};
        int[] b = {3, 3, 3, 4};
        Assert.assertEquals("NO", permutingTwoArray.twoArrays(5, a, b));
    }
}