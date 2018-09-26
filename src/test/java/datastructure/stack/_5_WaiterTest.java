package datastructure.stack;

import org.junit.Assert;
import org.junit.Test;

public class _5_WaiterTest {
    @Test
    public void test() {
        _5_Waiter waiter = new _5_Waiter();
        int[] input = {3, 3, 4, 4, 9};
        int[] output = waiter.waiter(input, 2);
        Assert.assertEquals(4, output[0]);
        Assert.assertEquals(9, output[2]);
        Assert.assertEquals(3, output[4]);
    }
}