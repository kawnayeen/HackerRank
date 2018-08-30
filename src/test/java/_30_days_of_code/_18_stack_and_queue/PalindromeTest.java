package _30_days_of_code._18_stack_and_queue;

import _30_days_of_code._18_stack_and_queue.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testPalindrome(){
        Palindrome palindrome = new Palindrome();
        Assert.assertTrue(palindrome.isPalindrome("racecar"));
        Assert.assertFalse(palindrome.isPalindrome("kamarul"));
    }
}