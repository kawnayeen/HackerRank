package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

public class _4_LeftRotateTest {
    @Test
    public void testLeftRotate() {
        int[] arr = {1, 2, 3};
        int[] rotated = new _4_LeftRotate().rotateLeft(2, arr);
        Assert.assertEquals(3, rotated[0]);
    }

    @Test
    public void testCaseOne() {
        int[] arr = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int[] rotated = new _4_LeftRotate().rotateLeft(10, arr);
        Assert.assertEquals(77, rotated[0]);
        Assert.assertEquals(97, rotated[1]);
        Assert.assertEquals(58, rotated[2]);
    }

    @Test
    public void testCaseTwo(){
        int[] arr = {98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81};
        int[] rotated = new _4_LeftRotate().rotateLeft(7, arr);
        Assert.assertEquals(26, rotated[0]);
        Assert.assertEquals(54, rotated[1]);
        Assert.assertEquals(63, rotated[2]);
    }
}