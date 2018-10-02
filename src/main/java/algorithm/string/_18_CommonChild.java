package algorithm.string;

import java.util.HashSet;
import java.util.Set;

public class _18_CommonChild {

    int commonChild(String s1, String s2) {
        Set<Character> s1CharSet = new HashSet<>();
        Set<Character> s2CharSet = new HashSet<>();
        for (char ch : s1.toCharArray())
            s1CharSet.add(ch);
        for (char ch : s2.toCharArray())
            s2CharSet.add(ch);
        s1CharSet.retainAll(s2CharSet);
        if (s1CharSet.isEmpty())
            return 0;
        StringBuilder s1Builder = new StringBuilder();
        for (char ch : s1.toCharArray())
            if (s1CharSet.contains(ch))
                s1Builder.append(ch);
        String commonS1 = s1Builder.toString().trim();
        StringBuilder s2Builder = new StringBuilder();
        for (char ch : s2.toCharArray())
            if (s1CharSet.contains(ch))
                s2Builder.append(ch);
        String commonS2 = s2Builder.toString().trim();
        int[][] dpTable = new int[commonS1.length() + 1][commonS2.length() + 1];
        for (int i = 0; i < dpTable.length; i++) {
            for (int j = 0; j < dpTable[0].length; j++) {
                if (i == 0 || j == 0)
                    dpTable[i][j] = 0;
                else if (commonS1.charAt(i - 1) == commonS2.charAt(j - 1)) {
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                } else {
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
                }
            }
        }
        return dpTable[commonS1.length()][commonS2.length()];
    }
}
