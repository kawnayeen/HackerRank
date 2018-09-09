package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _22_FindDigitsTest {
    @Test
    public void testFindDigit() {
        _22_FindDigits findDigits = new _22_FindDigits();
        Assert.assertEquals(3, findDigits.findDigits(1012));
    }
}