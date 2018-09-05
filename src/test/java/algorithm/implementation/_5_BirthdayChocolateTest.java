package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * kawnayeen
 * 5/9/18
 */
public class _5_BirthdayChocolateTest {
    @Test
    public void testChocolateCombination() {
        _5_BirthdayChocolate birthdayChocolate = new _5_BirthdayChocolate();
        List<Integer> segments = Arrays.asList(1, 2, 1, 3, 2);
        int day = 3;
        int month = 2;
        Assert.assertEquals(2, birthdayChocolate.birthday(segments, day, month));
    }
}