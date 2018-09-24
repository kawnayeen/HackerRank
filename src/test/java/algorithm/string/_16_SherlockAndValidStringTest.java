package algorithm.string;

import org.junit.Test;

public class _16_SherlockAndValidStringTest {
    @Test
    public void testValidString() {
        _16_SherlockAndValidString validString = new _16_SherlockAndValidString();
        System.out.println(validString.isValid("abcdefghhgfedecba"));
        System.out.println(validString.isValid("aabbccddeefghi"));
        System.out.println(validString.isValid("aabbcd"));
        System.out.println(validString.isValid("aabbc"));
        System.out.println(validString.isValid("abcc"));
        System.out.println(validString.isValid("aaabbbbcccc"));
        System.out.println(validString.isValid("abbbbcccc"));
        System.out.println(validString.isValid("abbbcccdddd"));
    }
}