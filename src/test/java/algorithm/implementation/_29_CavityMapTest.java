package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 10/9/18
 */
public class _29_CavityMapTest {
    @Test
    public void testCavityMap() {
        String[] grid = {"1112", "1912", "1892", "1134"};
        _29_CavityMap cavityMap = new _29_CavityMap();
        String[] output = cavityMap.cavityMap(grid);
        Assert.assertEquals("1X12", output[1]);
    }

    @Test
    public void testCavityMapCaseOne() {
        String[] grid = {"1 2", "2 1"};
        _29_CavityMap cavityMap = new _29_CavityMap();
        String[] output = cavityMap.cavityMap(grid);
        Assert.assertEquals("2 1", output[1]);
    }
}