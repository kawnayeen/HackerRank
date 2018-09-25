package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;


/**
 * kawnayeen
 * 25/9/18
 */
public class _1_EqualStackTest {
    @Test
    public void test() {
        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};
        Assert.assertEquals(5, new _1_EqualStack().equalStacks(h1, h2, h3));
    }
}