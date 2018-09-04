package algorithm.implementation;

import _30_days_of_code.base.ConsoleOutputTest;
import org.junit.Assert;
import org.junit.Test;

public class _2_AppleAndOrangeTest extends ConsoleOutputTest {
    @Test
    public void testAppleAndOrange() {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        _2_AppleAndOrange appleAndOrange = new _2_AppleAndOrange();
        appleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);
        Assert.assertEquals("1\n1\n", outContent.toString());
    }
}