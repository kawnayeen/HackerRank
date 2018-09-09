package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _20_ViralAdvertisingTest {
    @Test
    public void testViralAdvertising() {
        _20_ViralAdvertising viralAdvertising = new _20_ViralAdvertising();
        Assert.assertEquals(24, viralAdvertising.viralAdvertising(5));
    }
}