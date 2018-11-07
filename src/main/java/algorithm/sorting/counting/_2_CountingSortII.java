package algorithm.sorting.counting;

import java.util.Arrays;

/**
 * kawnayeen
 * 7/11/18
 */
public class _2_CountingSortII {
    int[] countingSort(int[] arr) {
        int maxValue = Arrays.stream(arr).max().orElse(arr[0]);
        int[] frequency = new int[maxValue + 1];
        for (int val : arr)
            frequency[val]++;
        int[] output = new int[arr.length];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                for (int j = 0; j < frequency[i]; j++) {
                    output[index] = i;
                    index++;
                }
            }
        }
        return output;
    }
}
