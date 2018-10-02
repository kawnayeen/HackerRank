package algorithm.dynamicprogramming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class _2_FibonacciModified {
    String fibonacciModified(int t1, int t2, int n) {
        List<BigInteger> fibonacci = new ArrayList<>();
        fibonacci.add(new BigInteger(String.valueOf(t1)));
        fibonacci.add(new BigInteger(String.valueOf(t2)));
        for (int i = 2; i < n; i++) {
            BigInteger nowFib = fibonacci.get(i - 2).add(fibonacci.get(i - 1).multiply(fibonacci.get(i - 1)));
            fibonacci.add(nowFib);
        }
        return fibonacci.get(fibonacci.size() - 1).toString();
    }
}
