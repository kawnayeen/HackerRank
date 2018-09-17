package _10_days_of_statistics;

import util.DoubleUtil;

public class _5_PoissonDistributionI extends _4_BinomialDistributionI {
    private static double e = 2.71828f;

    double getPoissonDistribution(double average, int expected) {
        populateFactorials(expected);
        double poissonDistribution = (Math.pow(average, expected) * Math.pow(e, -1 * average)) / factorials[expected];
        return DoubleUtil.round(poissonDistribution, 3);
    }
}
