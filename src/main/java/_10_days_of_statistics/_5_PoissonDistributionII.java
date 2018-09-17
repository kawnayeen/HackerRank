package _10_days_of_statistics;

import util.DoubleUtil;

public class _5_PoissonDistributionII {
    double getExpectedCost(int constantCost, int coefficient, double mean) {
        return DoubleUtil.round(
                (constantCost + coefficient * (mean + mean * mean)), 3);
    }
}
