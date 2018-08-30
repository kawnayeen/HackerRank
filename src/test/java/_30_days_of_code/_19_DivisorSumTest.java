package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 30/8/18
 */
public class _19_DivisorSumTest {
    @Test
    public void testSumOfDivisor() {
        _19_DivisorSum divisorSum = new _19_DivisorSum();
        Assert.assertEquals(12, divisorSum.getSumOfDivisor(6));
    }
}