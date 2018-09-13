package algorithm.implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * kawnayeen
 * 13/9/18
 */
public class _35_BigFactorial {
    void extraLongFactorials(int n) {
        List<BigInteger> factorials = new ArrayList<>();
        factorials.add(new BigInteger(String.valueOf(1)));
        factorials.add(new BigInteger(String.valueOf(1)));
        for (int i = 2; i <= n; i++) {
            BigInteger nowFactorial = factorials.get(i - 1).multiply(new BigInteger(String.valueOf(i)));
            factorials.add(nowFactorial);
        }
        System.out.println(factorials.get(n));
    }
}
