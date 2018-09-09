package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _24_CutTheSticksTest {
    @Test
    public void testCutTheSticks() {
        _24_CutTheSticks cutTheSticks = new _24_CutTheSticks();
        int[] input = {1, 2, 3, 4, 3, 3, 2, 1};
        int[] output = cutTheSticks.cutTheSticks(input);
        Assert.assertEquals(8, output[0]);
        Assert.assertEquals(6, output[1]);
        Assert.assertEquals(4, output[2]);
        Assert.assertEquals(1, output[3]);

    }
}