package datastructure.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * kawnayeen
 * 3/9/18
 */
public class _7_NewYearChaosTest {
    _7_NewYearChaos newYearChaos;

    @Before
    public void init() {
        newYearChaos = new _7_NewYearChaos();
    }

    @Test
    public void sampleTestCase0() {
        int[] input = {2, 1, 5, 3, 4};
        Assert.assertEquals("3", newYearChaos.minimumBribes(input));
        int[] input2 = {2, 5, 1, 3, 4};
        Assert.assertEquals(_7_NewYearChaos.TOO_CHAOTIC, newYearChaos.minimumBribes(input2));
    }

    @Test
    public void sampleTestCase1() {
        int[] input = {5 ,1, 2, 3, 7, 8, 6, 4};
        Assert.assertEquals(_7_NewYearChaos.TOO_CHAOTIC, newYearChaos.minimumBribes(input));
    }

    @Test
    public void sampleTestCase2() {
        int[] input = {1, 2, 5, 3, 4, 7, 8, 6};
        Assert.assertEquals("4", newYearChaos.minimumBribes(input));
    }
}