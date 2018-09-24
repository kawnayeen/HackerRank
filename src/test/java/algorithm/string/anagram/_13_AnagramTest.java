package algorithm.string.anagram;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 24/9/18
 */
public class _13_AnagramTest {

    @Test
    public void anagram() {
        _13_Anagram anagram = new _13_Anagram();
        Assert.assertEquals(3,anagram.anagram("aaabbb"));
        Assert.assertEquals(1,anagram.anagram("ab"));
        Assert.assertEquals(-1,anagram.anagram("abc"));
        Assert.assertEquals(2,anagram.anagram("mnop"));
        Assert.assertEquals(0, anagram.anagram("xyyx"));
        Assert.assertEquals(1, anagram.anagram("xaxbbbxx"));
    }
}