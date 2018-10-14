package algorithm.greedy;

import java.util.Arrays;

public class _2_MaxMin {
    int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        int maxStartingIndex = arr.length - k + 1;
        for (int i = 0; i < maxStartingIndex; i++) {
            int diff = arr[i + k - 1] - arr[i];
            if (diff < minDifference)
                minDifference = diff;
        }
        return minDifference;
    }
}
