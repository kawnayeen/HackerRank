package algorithm.warmup;

import org.junit.Assert;
import org.junit.Test;

public class _10_TimeConversionTest {
    @Test
    public void testTimeConversion() {
        _10_TimeConversion timeConversion = new _10_TimeConversion();
        Assert.assertEquals("19:05:45",timeConversion.timeConversion("07:05:45PM"));
        Assert.assertEquals("00:40:22",timeConversion.timeConversion("12:40:22AM"));
        Assert.assertEquals("12:40:22",timeConversion.timeConversion("12:40:22PM"));
    }
}