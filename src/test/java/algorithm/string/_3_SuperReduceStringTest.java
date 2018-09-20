package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

public class _3_SuperReduceStringTest {
    @Test
    public void testSuperReduce() {
        _3_SuperReduceString superReduceString = new _3_SuperReduceString();
        Assert.assertEquals("abd", superReduceString.superReducedString("aaabccddd"));
    }
}