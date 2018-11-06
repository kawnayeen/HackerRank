package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _49_StrangeCounterTest {

    @Test
    public void strangeCounter() {
        _49_StrangeCounter strangeCounter = new _49_StrangeCounter();
        Assert.assertEquals(8, strangeCounter.strangeCounter(14));
    }
}