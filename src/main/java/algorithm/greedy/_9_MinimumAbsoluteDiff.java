package algorithm.greedy;

import java.util.Arrays;

public class _9_MinimumAbsoluteDiff {
    int minimumAbsoluteDifference(int[] arr) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int minimumDifference = Integer.MAX_VALUE;
        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (Math.abs(sortedArr[i + 1] - sortedArr[i]) < minimumDifference)
                minimumDifference = Math.abs(sortedArr[i + 1] - sortedArr[i]);
        }
        return minimumDifference;
    }
}
