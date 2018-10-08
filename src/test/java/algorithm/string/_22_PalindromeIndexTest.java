package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _22_PalindromeIndexTest {

    @Test
    public void palindromeIndex() {
        _22_PalindromeIndex palindromeIndex = new _22_PalindromeIndex();
        Assert.assertEquals(3, palindromeIndex.palindromeIndex("aaab"));
        Assert.assertEquals(0, palindromeIndex.palindromeIndex("baa"));
        Assert.assertEquals(-1, palindromeIndex.palindromeIndex("aaa"));
    }
}