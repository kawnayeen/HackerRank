package algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _4_MaxSubArrayTest {

    @Test
    public void maxSubarray() {
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {2, -1, 2, 3, 4, -5};
        int[] input3 = {-2, -3, -1, -4, -6};
        int[] input4 = {1};
        _4_MaxSubArray maxSubArray = new _4_MaxSubArray();
        int[] output1 = maxSubArray.maxSubarray(input1);
        int[] output2 = maxSubArray.maxSubarray(input2);
        int[] output3 = maxSubArray.maxSubarray(input3);
        int[] output4 = maxSubArray.maxSubarray(input4);
        Assert.assertEquals(10, output1[0]);
        Assert.assertEquals(10, output1[1]);
        Assert.assertEquals(10, output2[0]);
        Assert.assertEquals(11, output2[1]);
        Assert.assertEquals(-1, output3[0]);
        Assert.assertEquals(-1, output3[1]);
        Assert.assertEquals(1, output4[0]);
        Assert.assertEquals(1, output4[1]);
    }
}