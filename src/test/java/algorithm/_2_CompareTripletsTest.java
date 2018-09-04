package algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 4/9/18
 */
public class _2_CompareTripletsTest {
    @Test
    public void testTriplet() {
        List<Integer> ratingOfAlice = Arrays.asList(17, 28, 30);
        List<Integer> ratingOfBob = Arrays.asList(99, 16, 8);
        _2_CompareTriplets compareTriplets = new _2_CompareTriplets();
        Assert.assertEquals(2, (int) compareTriplets.compareTriplets(ratingOfAlice, ratingOfBob).get(0));
    }
}