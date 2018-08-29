package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 29/8/18
 */
public class _6_LetsReviewTest {
    @Test
    public void testSplitting(){
        _6_LetsReview letsReview = new _6_LetsReview();
        Assert.assertEquals("Hce akr", letsReview.splitIntoOddAndEven("Hacker"));
    }
}