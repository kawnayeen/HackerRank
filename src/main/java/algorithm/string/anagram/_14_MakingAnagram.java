package algorithm.string.anagram;

import java.util.HashSet;

/**
 * kawnayeen
 * 24/9/18
 */
public class _14_MakingAnagram {
    int makingAnagrams(String s1, String s2) {
        if (s1.equals(s2))
            return 0;
        HashSet<Character> charSet = new HashSet<>();
        for (char ch : s1.toCharArray())
            charSet.add(ch);
        for (char ch : s2.toCharArray())
            charSet.add(ch);
        CharCounts firstCharCount = new CharCounts(charSet, s1);
        CharCounts secondCharCount = new CharCounts(charSet, s2);
        if (firstCharCount.isSame(secondCharCount))
            return 0;
        return firstCharCount.getDifference(secondCharCount);
    }
}
