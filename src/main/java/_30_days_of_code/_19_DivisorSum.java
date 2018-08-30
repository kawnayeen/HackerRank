package _30_days_of_code;

import java.util.stream.IntStream;

/**
 * kawnayeen
 * 30/8/18
 */
public class _19_DivisorSum {
    public int getSumOfDivisor(int n) {
        int sumOfSmallerDivisor = IntStream.range(1, (n / 2) + 1).filter(i -> n % i == 0).sum();
        return n + sumOfSmallerDivisor;
    }
}
