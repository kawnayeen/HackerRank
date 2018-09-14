package algorithm.implementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _39_TimeInWordsTest {
    _39_TimeInWords timeInWords;

    @Before
    public void init() {
        timeInWords = new _39_TimeInWords();
    }

    @Test
    public void testOClock() {
        Assert.assertEquals("five o' clock", timeInWords.timeInWords(5, 0));
        Assert.assertEquals("one minute past five", timeInWords.timeInWords(5, 1));
        Assert.assertEquals("ten minutes past five", timeInWords.timeInWords(5, 10));
        Assert.assertEquals("quarter past five", timeInWords.timeInWords(5, 15));
        Assert.assertEquals("half past five", timeInWords.timeInWords(5, 30));
        Assert.assertEquals("twenty minutes to six", timeInWords.timeInWords(5, 40));
        Assert.assertEquals("quarter to six", timeInWords.timeInWords(5, 45));
        Assert.assertEquals("thirteen minutes to six", timeInWords.timeInWords(5, 47));
        Assert.assertEquals("thirteen minutes to one", timeInWords.timeInWords(12, 47));
    }
}