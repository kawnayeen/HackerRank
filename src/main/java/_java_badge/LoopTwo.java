package _java_badge;

// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.stream.IntStream;

public class LoopTwo {
    public void printSeries(int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(getValueOfIthPosition(a, b, i));
            System.out.print(" ");
        }
    }

    public long getValueOfIthPosition(int a, int b, int i) {
        long sum = IntStream.rangeClosed(0, i).mapToLong(val -> (long) (Math.pow(2, val) * b)).sum();
        return (a + sum);
    }
}
