package util;

import java.util.ArrayList;
import java.util.List;

public class FactorialUtil {
    static List<Integer> factorials;

    static {
        factorials = new ArrayList<>();
        factorials.add(1);
        factorials.add(1);
    }

    public static int getFactorial(int n) {
        if (factorials.size() < (n + 1)) {
            int lastCalculated = factorials.size() - 1;
            for (int i = lastCalculated + 1; i <= n; i++) {
                factorials.add(i * factorials.get(i - 1));
            }
        }
        return factorials.get(n);
    }
}
