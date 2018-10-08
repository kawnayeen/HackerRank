package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 8/10/18
 */
public class _46_HackerRankInStringTest {

    @Test
    public void hackerrankInString() {
        _46_HackerRankInString hackerRankInString = new _46_HackerRankInString();
        Assert.assertEquals("YES", hackerRankInString.hackerrankInString("hereiamstackerrank"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("hackerworld"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("knarrekcah"));
        Assert.assertEquals("YES", hackerRankInString.hackerrankInString("hackerrank"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("hackeronek"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("abcdefghijklmnopqrstuvwxyz"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("rhackerank"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("ahankercka"));
        Assert.assertEquals("YES", hackerRankInString.hackerrankInString("hacakaeararanaka"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("crackerhackerknar"));
        Assert.assertEquals("NO", hackerRankInString.hackerrankInString("hhhackkerbanker"));
    }
}