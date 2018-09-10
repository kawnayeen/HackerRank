package algorithm.implementation;


import org.junit.Assert;
import org.junit.Test;

public class _34_JumpingOnTheCloudsTest {
    @Test
    public void testJumpingOnTheCloud() {
        int[] input = {0, 0, 0, 0, 1, 0};
        _34_JumpingOnTheClouds jumpingOnTheClouds = new _34_JumpingOnTheClouds();
        Assert.assertEquals(3, jumpingOnTheClouds.jumpingOnClouds(input));
    }
}