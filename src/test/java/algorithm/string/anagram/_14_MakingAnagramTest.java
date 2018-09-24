package algorithm.string.anagram;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 24/9/18
 */
public class _14_MakingAnagramTest {

    @Test
    public void makingAnagrams() {
        _14_MakingAnagram makingAnagram = new _14_MakingAnagram();
        Assert.assertEquals(4, makingAnagram.makingAnagrams("cde", "abc"));
        Assert.assertEquals(6, makingAnagram.makingAnagrams("abc", "amnop"));
    }
}