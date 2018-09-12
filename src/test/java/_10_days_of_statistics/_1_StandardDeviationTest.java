package _10_days_of_statistics;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 12/9/18
 */
public class _1_StandardDeviationTest {
    @Test
    public void testStandardDeviation() {
        int[] input = {10, 40, 30, 50, 20};
        _1_StandardDeviation standardDeviation = new _1_StandardDeviation();
        Assert.assertEquals(14.1, standardDeviation.findStandardDeviation(input), 0.05);
    }
}