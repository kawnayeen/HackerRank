package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _16_PickingNumbersTest {
    @Test
    public void testNumberPicking() {
        int[] input = {1, 2, 2, 3, 1, 2};
        Assert.assertEquals(5, new _16_PickingNumbers().pickingNumbers(input));
    }
}