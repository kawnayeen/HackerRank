package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _26_ArrayEqualizationTest {
    @Test
    public void testArrayEqualization() {
        int[] input = {3, 3, 2, 1, 3};
        _26_ArrayEqualization arrayEqualization = new _26_ArrayEqualization();
        Assert.assertEquals(2, arrayEqualization.equalizeArray(input));
    }
}