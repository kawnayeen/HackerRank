package algorithm.dynamicprogramming;

import java.util.Arrays;

public class _4_MaxSubArray {
    int[] maxSubarray(int[] arr) {
        if (arr.length == 1)
            return new int[]{arr[0], arr[0]};
        int[] positiveNumbers = Arrays.stream(arr).filter(val -> val > 0).toArray();
        int maxSubSequenceSum = 0;
        int maxContinuousSum = 0;
        if (positiveNumbers.length > 0)
            maxSubSequenceSum = Arrays.stream(positiveNumbers).sum();
        else {
            maxSubSequenceSum = Arrays.stream(arr).max().orElse(arr[0]);
            maxContinuousSum = maxSubSequenceSum;
            return new int[]{maxContinuousSum, maxSubSequenceSum};
        }
        int[] dpTable = new int[arr.length];
        dpTable[0] = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i] + dpTable[i - 1]) {
                dpTable[i] = arr[i];
            } else {
                dpTable[i] = arr[i] + dpTable[i - 1];
            }
            if (dpTable[i] > maxValue)
                maxValue = dpTable[i];
        }
        return new int[]{maxValue, maxSubSequenceSum};
    }
}
