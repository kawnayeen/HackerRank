package algorithm.string;

import java.util.HashSet;

public class _20_TwoStrings {
    private static final String YES = "YES";
    private static final String NO = "NO";

    String twoStrings(String s1, String s2) {
        HashSet<Character> s1CharSet = new HashSet<>();
        HashSet<Character> s2CharSet = new HashSet<>();
        for (char ch : s1.toCharArray())
            s1CharSet.add(ch);
        for (char ch : s2.toCharArray())
            s2CharSet.add(ch);
        s1CharSet.retainAll(s2CharSet);
        return s1CharSet.size() > 0 ? YES : NO;
    }
}
