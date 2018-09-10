package algorithm.implementation;

/**
 * kawnayeen
 * 10/9/18
 */
public class _30_RepeatedString {
    long repeatedString(String s, long n) {
        int numberOfA = 0;
        int numberOfATillSplit = 0;
        int strLength = s.length();
        long splitIndex = n % strLength;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                numberOfA++;
                if (i < splitIndex)
                    numberOfATillSplit++;
            }
        }
        return (n / strLength) * numberOfA + numberOfATillSplit;
    }
}
