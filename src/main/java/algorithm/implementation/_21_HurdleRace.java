package algorithm.implementation;

import java.util.Arrays;

public class _21_HurdleRace {
    int hurdleRace(int k, int[] height) {
        int maxValue = Arrays.stream(height).max().orElse(height[0]);
        return maxValue > k ? maxValue - k : 0;
    }
}
