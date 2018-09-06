package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 6/9/18
 */
public class _10_SockMerchantTest {
    @Test
    public void testSockMerchant() {
        _10_SockMerchant sockMerchant = new _10_SockMerchant();
        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Assert.assertEquals(3, sockMerchant.sockMerchant(9,array));
    }
}