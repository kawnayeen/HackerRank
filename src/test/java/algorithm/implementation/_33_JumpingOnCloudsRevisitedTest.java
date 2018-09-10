package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 10/9/18
 */
public class _33_JumpingOnCloudsRevisitedTest {
    @Test
    public void testJumpingOnClouds() {
        _33_JumpingOnCloudsRevisited cloudsRevisited = new _33_JumpingOnCloudsRevisited();
        int[] input = {0, 0, 1, 0, 0, 1, 1, 0};
        Assert.assertEquals(92,cloudsRevisited.jumpingOnClouds(input,2));
    }
}