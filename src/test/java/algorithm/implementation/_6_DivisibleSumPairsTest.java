package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 5/9/18
 */
public class _6_DivisibleSumPairsTest {
    @Test
    public void testDivisibleSumPair() {
        _6_DivisibleSumPairs divisibleSumPairs = new _6_DivisibleSumPairs();
        int[] arr = {1, 2, 3, 6, 1, 2};
        Assert.assertEquals(5,divisibleSumPairs.divisibleSumPairs(6,3,arr));
    }
}