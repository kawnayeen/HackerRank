package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

public class _18_StackAndQueueTest {
    @Test
    public void testPalindrome(){
        _18_StackAndQueue palindrome = new _18_StackAndQueue();
        Assert.assertTrue(palindrome.isPalindrome("racecar"));
        Assert.assertFalse(palindrome.isPalindrome("kamarul"));
    }
}