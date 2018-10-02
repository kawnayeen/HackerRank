package algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1_MaxStockProfitTest {

    @Test
    public void stockmax() {
        int[] input = {1, 3, 1, 2};
        _1_MaxStockProfit maxStockProfit = new _1_MaxStockProfit();
        Assert.assertEquals(3, maxStockProfit.maximizeProfit(input));
        int[] input2 = {5 ,4 ,3 ,4 ,5};
        Assert.assertEquals(4, maxStockProfit.maximizeProfit(input2));
    }
}