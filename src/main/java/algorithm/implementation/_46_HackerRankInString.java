package algorithm.implementation;

/**
 * kawnayeen
 * 8/10/18
 */
public class _46_HackerRankInString {
    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final String HACKERRANK = "hackerrank";

    String hackerrankInString(String s) {
        int i = 0;
        boolean contained = true;
        for (char ch : HACKERRANK.toCharArray()) {
            if (i >= s.length()) {
                contained = false;
                break;
            }
            for (; i < s.length(); ) {
                if (ch == s.charAt(i)) {
                    i = i + 1;
                    break;
                }
                i = i + 1;
            }
        }
        if (contained)
            return YES;
        return NO;
    }
}
