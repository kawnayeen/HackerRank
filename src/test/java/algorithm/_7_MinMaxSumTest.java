package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class _7_MinMaxSumTest {
    @Test
    public void testMinMaxSum(){
        int[] arr = {1,3,5,7,9};
        Assert.assertEquals("16 24", new _7_MinMaxSum().miniMaxSum(arr));
    }
}