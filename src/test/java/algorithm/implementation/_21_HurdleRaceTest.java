package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _21_HurdleRaceTest {
    @Test
    public void testHurdleRace() {
        _21_HurdleRace hurdleRace = new _21_HurdleRace();
        int[] input = {1, 6, 3, 5, 2};
        Assert.assertEquals(2, hurdleRace.hurdleRace(4, input));
    }
}