package algorithm.string.anagram;

import java.util.HashSet;

/**
 * kawnayeen
 * 24/9/18
 */
public class _13_Anagram {
    int anagram(String s) {
        if (s.length() % 2 == 1)
            return -1;
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);
        if (firstHalf.equals(secondHalf))
            return 0;
        HashSet<Character> charSet = new HashSet<>();
        for (char ch : s.toCharArray())
            charSet.add(ch);
        CharCounts firstCharCount = new CharCounts(charSet, firstHalf);
        CharCounts secondCharCount = new CharCounts(charSet, secondHalf);
        if (firstCharCount.isSame(secondCharCount))
            return 0;
        return firstCharCount.getDifference(secondCharCount) / 2;
    }
}
