package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _23_CircularRightRotationTest {
    @Test
    public void testRightRotation() {
        int[] input = {1, 6, 3, 5, 2};
        int[] query = {0, 1, 2};
        _23_CircularRightRotation rightRotation = new _23_CircularRightRotation();
        int[] rotatedInput = rightRotation.circularArrayRotation(input, 2, query);
        Assert.assertEquals(5, rotatedInput[0]);
        Assert.assertEquals(1, rotatedInput[2]);
    }
}