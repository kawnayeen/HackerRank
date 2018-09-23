package _10_days_of_statistics;

import util.DoubleUtil;
import util.ErrorFunction;

public class _5_NormalDistribution {
    double getCumulativeProbability(double upTo, double mean, double standardDeviation) {
        double z = (upTo - mean) / (standardDeviation * Math.sqrt(2));
        double zScore = ErrorFunction.erf(z);
        double cumulativeProbability = 0.5 * (1 + zScore);
        return DoubleUtil.round(cumulativeProbability, 3);
    }
}
