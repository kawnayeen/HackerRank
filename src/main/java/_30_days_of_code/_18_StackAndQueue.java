package _30_days_of_code;

public class _18_StackAndQueue {
    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
