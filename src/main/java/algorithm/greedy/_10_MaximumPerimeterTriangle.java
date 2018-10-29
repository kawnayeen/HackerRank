package algorithm.greedy;

import java.util.Arrays;

/**
 * kawnayeen
 * 29/10/18
 */
public class _10_MaximumPerimeterTriangle {
    int[] maximumPerimeterTriangle(int[] sticks) {
        sticks = Arrays.stream(sticks).sorted().toArray();
        int size = sticks.length;
        for (int i = size - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    if (sticks[j] + sticks[k] > sticks[i])
                        return new int[]{sticks[k], sticks[j], sticks[i]};
                }
            }
        }
        return new int[]{-1};
    }
}
