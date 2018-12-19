package algorithm.implementation;

import java.util.Arrays;

public class _50_FairRotation {

    void fairRations(int[] B) {
        long sum = Arrays.stream(B).sum();
        if (isOdd(sum)) {
            System.out.println("NO");
            return;
        }

        int distributionCount = 0;
        for (int i = 0; i < B.length - 1; i++) {
            if (isOdd(B[i])) {
                B[i + 1] += 1;
                distributionCount += 2;
            }
        }
        System.out.println(String.valueOf(distributionCount));
    }

    boolean isOdd(long value) {
        return value % 2 == 1;
    }
}
