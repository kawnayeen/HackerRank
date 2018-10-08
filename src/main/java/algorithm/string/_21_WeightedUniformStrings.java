package algorithm.string;

import java.util.HashSet;

public class _21_WeightedUniformStrings {
    private static final String YES = "Yes";
    private static final String NO = "No";

    String[] weightedUniformStrings(String s, int[] queries) {
        char lastChar = '-';
        int lastValue = 0;
        HashSet<Integer> weightSet = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (ch == lastChar) {
                lastValue += getWeight(ch);
            } else {
                lastChar = ch;
                lastValue = getWeight(ch);
            }
            weightSet.add(lastValue);
        }
        String[] output = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (weightSet.contains(queries[i]))
                output[i] = YES;
            else
                output[i] = NO;
        }
        return output;
    }

    private int getWeight(char ch) {
        return ((int) ch) - 96;
    }
}
