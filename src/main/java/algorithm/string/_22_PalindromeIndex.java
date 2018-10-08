package algorithm.string;

public class _22_PalindromeIndex {
    int palindromeIndex(String s) {
        int index = -1;
        if (isPalindrome(s))
            return index;
        int startIndex = 0;
        int endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                break;
            }
        }
        if (doesMakePalindrome(s, startIndex))
            return startIndex;
        if (doesMakePalindrome(s, endIndex))
            return endIndex;
        return index;
    }

    boolean doesMakePalindrome(String s, int removeIndex) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == removeIndex) {

            } else {
                builder.append(s.charAt(i));
            }
        }
        return isPalindrome(builder.toString());
    }

    boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
