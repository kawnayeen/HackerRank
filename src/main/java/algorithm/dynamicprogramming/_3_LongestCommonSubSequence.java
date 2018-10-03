package algorithm.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _3_LongestCommonSubSequence {
    int[] longestCommonSubsequence(int[] a, int[] b) {
        int[][] dpTable = new int[a.length + 1][b.length + 1];
        List<Integer> subSequence = new ArrayList<>();
        for (int i = 0; i < dpTable.length; i++) {
            for (int j = 0; j < dpTable[0].length; j++) {
                if (i == 0 || j == 0)
                    dpTable[i][j] = 0;
                else if (a[i - 1] == b[j - 1]) {
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                } else {
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
                }
            }
        }
        int i = a.length;
        int j = b.length;
        while (i > 0 && j > 0) {
            if (a[i - 1] == b[j - 1]) {
                subSequence.add(a[i - 1]);
                i--;
                j--;
            } else if (dpTable[i - 1][j] > dpTable[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        Collections.reverse(subSequence);
        return subSequence.stream().mapToInt(Integer::intValue).toArray();
    }
}
