package datastructure.stack;

import java.util.HashSet;

/**
 * kawnayeen
 * 25/9/18
 */
public class _1_EqualStack {
    int equalStacks(int[] h1, int[] h2, int[] h3) {
        HashSet<Integer> sum1 = getSetOfSum(h1);
        HashSet<Integer> sum2 = getSetOfSum(h2);
        HashSet<Integer> sum3 = getSetOfSum(h3);
        sum1.retainAll(sum2);
        sum1.retainAll(sum3);
        int maxValue = -1;
        for (int val : sum1) {
            if (val > maxValue)
                maxValue = val;
        }
        return maxValue;
    }

    HashSet<Integer> getSetOfSum(int[] arr) {
        HashSet<Integer> sum = new HashSet<>();
        sum.add(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
            sum.add(arr[i]);
        }
        return sum;
    }
}
