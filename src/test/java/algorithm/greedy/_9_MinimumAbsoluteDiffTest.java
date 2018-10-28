package algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _9_MinimumAbsoluteDiffTest {

    @Test
    public void minimumAbsoluteDifference() {
        _9_MinimumAbsoluteDiff minDiff = new _9_MinimumAbsoluteDiff();
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        Assert.assertEquals(1, minDiff.minimumAbsoluteDifference(arr));
    }
}