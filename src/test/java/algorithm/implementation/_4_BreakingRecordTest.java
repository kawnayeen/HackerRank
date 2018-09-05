package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 5/9/18
 */
public class _4_BreakingRecordTest {
    @Test
    public void testBreakingRecord() {
        int[] input = {2, 3, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] output = new _4_BreakingRecord().breakingRecords(input);
        Assert.assertEquals(4, output[0]);
        Assert.assertEquals(0, output[1]);
    }
}