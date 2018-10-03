package algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _3_LongestCommonSubSequenceTest {

    @Test
    public void longestCommonSubsequence() {
        _3_LongestCommonSubSequence lcs = new _3_LongestCommonSubSequence();
        int[] input1 = {1, 2, 3, 4, 1};
        int[] input2 = {3, 4, 1, 2, 1, 3};
        int[] output = lcs.longestCommonSubsequence(input1, input2);
        Assert.assertEquals(1, output[0]);
        Assert.assertEquals(2, output[1]);
        Assert.assertEquals(3, output[2]);
    }
}