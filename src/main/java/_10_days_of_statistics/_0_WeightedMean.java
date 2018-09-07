package _10_days_of_statistics;

import util.DoubleUtil;

/**
 * kawnayeen
 * 7/9/18
 */
public class _0_WeightedMean {
    double getWeightedMean(int[] values, int[] weight) {
        int sumOfWeight = 0;
        int sumOfWeightedValue = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfWeight += weight[i];
            sumOfWeightedValue += values[i] * weight[i];
        }
        return DoubleUtil.round((sumOfWeightedValue * 1f) / sumOfWeight, 1);
    }
}
