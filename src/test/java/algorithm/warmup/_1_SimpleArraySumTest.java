package algorithm.warmup;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 4/9/18
 */
public class _1_SimpleArraySumTest {
    @Test
    public void testArraySum() {
        int[] arr = {-9, 3, -2, 4};
        Assert.assertEquals(-4, new _1_SimpleArraySum().getSum(arr));
    }
}