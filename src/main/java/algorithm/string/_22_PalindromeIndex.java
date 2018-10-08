package algorithm.string;

public class _22_PalindromeIndex {
    int palindromeIndex(String s) {
        int index = -1;
        if (isPalindrome(s))
            return index;
        for (int i = 0; i < s.length(); i++) {
            String firstPart = "";
            String secondPart = "";
            if (i >= 1)
                firstPart = s.substring(0, i);
            if (i < s.length() - 1) {
                secondPart = s.substring(i + 1);
            }
            String finalString = firstPart + secondPart;
            if (isPalindrome(finalString)) {
                index = i;
                break;
            }
        }
        return index;
    }

    boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
