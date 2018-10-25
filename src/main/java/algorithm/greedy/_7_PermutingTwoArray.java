package algorithm.greedy;

import java.util.Arrays;

public class _7_PermutingTwoArray {
    public static final String YES = "YES";
    public static final String NO = "NO";

    String twoArrays(int k, int[] A, int[] B) {
        A = Arrays.stream(A).sorted().toArray();
        B = Arrays.stream(B).sorted().toArray();
        int totalElement = A.length;
        for (int i = 0; i < totalElement; i++) {
            if (A[i] + B[totalElement - i - 1] < k)
                return NO;
        }
        return YES;
    }
}
