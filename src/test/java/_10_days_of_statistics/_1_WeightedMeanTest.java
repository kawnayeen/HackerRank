package _10_days_of_statistics;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 7/9/18
 */
public class _1_WeightedMeanTest {
    @Test
    public void testWeightedMean() {
        int[] values = {10, 40, 30, 50, 20};
        int[] weights = {1, 2, 3, 4, 5};
        _1_WeightedMean weightedMean = new _1_WeightedMean();
        Assert.assertEquals(32.0, weightedMean.getWeightedMean(values, weights), 0.05);
    }
}