package algorithm.search;

import java.util.List;

public class _2_SherlockAndArray {
    String balancedSums(List<Integer> arr) {
        long[] dpSum = new long[arr.size()];
        dpSum[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dpSum[i] = dpSum[i - 1] + arr.get(i);
        }
        boolean found = false;
        long lastSum = dpSum[arr.size() - 1];
        for (int i = 0; i < arr.size(); i++) {
            long prevSum;
            if (i == 0)
                prevSum = 0;
            else
                prevSum = dpSum[i - 1];
            long nextSum = lastSum - dpSum[i];
            if (prevSum == nextSum) {
                found = true;
                break;
            }
        }
        return found ? "YES" : "NO";
    }
}
