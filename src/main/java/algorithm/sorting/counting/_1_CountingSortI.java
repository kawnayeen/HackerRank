package algorithm.sorting.counting;

import java.util.Arrays;

/**
 * kawnayeen
 * 7/11/18
 */
public class _1_CountingSortI {
    int[] countingSort(int[] arr) {
        int maxValue = Arrays.stream(arr).max().orElse(arr[0]);
        int[] output = new int[maxValue + 1];
        for (int val : arr)
            output[val]++;
        return output;
    }
}
