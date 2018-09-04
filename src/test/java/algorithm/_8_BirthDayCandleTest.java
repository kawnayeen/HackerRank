package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class _8_BirthDayCandleTest {
    @Test
    public void testBirthDayCandle() {
        _8_BirthDayCandle birthDayCandle = new _8_BirthDayCandle();
        int[] candleHeights = {3, 2, 1, 3};
        Assert.assertEquals(2, birthDayCandle.birthdayCakeCandles(candleHeights));
    }
}