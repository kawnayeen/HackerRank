package algorithm.implementation;

/**
 * kawnayeen
 * 5/9/18
 */
public class _6_DivisibleSumPairs {
    int divisibleSumPairs(int n, int k, int[] ar) {
        int divisibleCount = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = (i + 1); j < ar.length; j++) {
                if((ar[i]+ar[j])%k==0)
                    divisibleCount++;
            }
        }
        return divisibleCount;
    }
}
