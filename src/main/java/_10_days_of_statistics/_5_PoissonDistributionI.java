package _10_days_of_statistics;

import util.DoubleUtil;
import util.FactorialUtil;

public class _5_PoissonDistributionI {
    private static double e = 2.71828f;

    double getPoissonDistribution(double average, int expected) {
        double poissonDistribution = (Math.pow(average, expected) * Math.pow(e, -1 * average)) / FactorialUtil.getFactorial(expected);
        return DoubleUtil.round(poissonDistribution, 3);
    }
}
