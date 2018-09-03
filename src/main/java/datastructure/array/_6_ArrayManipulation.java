package datastructure.array;

/**
 * kawnayeen
 * 3/9/18
 */
public class _6_ArrayManipulation {
    /**
     * difference array
     * track the increase and decrease at specific points
     * value at any given index is the sum of difference till that index
     */
    long arrayManipulation(int n, int[][] queries) {
        long maxValue = Long.MIN_VALUE;
        long[] arr = new long[n];
        int querySize = queries.length;
        for (int q = 0; q < querySize; q++) {
            int[] query = queries[q];
            int startIndex = query[0] - 1;
            int endIndex = query[1];
            int valueToAdd = query[2];
            arr[startIndex] += valueToAdd;
            if (endIndex < n) {
                arr[endIndex] -= valueToAdd;
            }
        }
        long temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp > maxValue)
                maxValue = temp;
        }
        return maxValue;
    }
}
