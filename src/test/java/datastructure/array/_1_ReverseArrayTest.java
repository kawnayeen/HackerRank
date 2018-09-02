package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

public class _1_ReverseArrayTest {
    @Test
    public void testReverseArray() {
        int[] intValues = new int[]{1, 8, 3, 4, 5, 6, 7, 2};
        int[] reverseArr = new _1_ReverseArray().reverse(intValues);
        Assert.assertEquals(2, reverseArr[0]);
        Assert.assertEquals(7, reverseArr[1]);
        Assert.assertEquals(6, reverseArr[2]);
        Assert.assertEquals(5, reverseArr[3]);
        Assert.assertEquals(4, reverseArr[4]);
        Assert.assertEquals(3, reverseArr[5]);
        Assert.assertEquals(8, reverseArr[6]);
        Assert.assertEquals(1, reverseArr[7]);
    }
}