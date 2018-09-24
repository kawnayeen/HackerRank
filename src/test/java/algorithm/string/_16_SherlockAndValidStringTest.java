package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

public class _16_SherlockAndValidStringTest {
    @Test
    public void testValidString() {
        _16_SherlockAndValidString validString = new _16_SherlockAndValidString();
        Assert.assertEquals("YES", validString.isValid("abcdefghhgfedecba"));
        Assert.assertEquals("NO",validString.isValid("aabbccddeefghi"));
        Assert.assertEquals("NO",validString.isValid("aabbcd"));
        Assert.assertEquals("YES",validString.isValid("aabbc"));
        Assert.assertEquals("YES",validString.isValid("abcc"));
        Assert.assertEquals("NO",validString.isValid("aaabbbbcccc"));
        Assert.assertEquals("YES",validString.isValid("abbbbcccc"));
        Assert.assertEquals("NO",validString.isValid("abbbcccdddd"));
    }
}