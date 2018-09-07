package _10_days_of_statistics;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 7/9/18
 */
public class _0_MeanMedianModeTest {
    @Test
    public void testMeanCalculation() {
        _0_MeanMedianMode meanMedianMode = new _0_MeanMedianMode();
        Assert.assertEquals(43900.6,
                meanMedianMode.findMean(new int[]{64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060}),
                0.05);
    }

    @Test
    public void testMedianCalculation() {
        _0_MeanMedianMode meanMedianMode = new _0_MeanMedianMode();
        Assert.assertEquals(44627.5,
                meanMedianMode.findMedian(new int[]{64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060}),
                0.05);
    }

    @Test
    public void testMedianMode() {
        _0_MeanMedianMode meanMedianMode = new _0_MeanMedianMode();
        Assert.assertEquals(4978,
                meanMedianMode.findMode(new int[]{64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060}));
    }
}