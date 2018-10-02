package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 2/10/18
 */
public class _44_ChocolateFeastTest {

    @Test
    public void chocolateFeast() {
        _44_ChocolateFeast chocolateFeast = new _44_ChocolateFeast();
        Assert.assertEquals(6, chocolateFeast.chocolateFeast(10, 2, 5));
        Assert.assertEquals(3, chocolateFeast.chocolateFeast(12, 4, 4));
        Assert.assertEquals(5, chocolateFeast.chocolateFeast(6, 2, 2));
    }
}