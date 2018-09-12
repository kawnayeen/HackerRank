package _10_days_of_statistics;

import util.DoubleUtil;

import java.util.Arrays;

/**
 * kawnayeen
 * 12/9/18
 */
public class _1_StandardDeviation {
    double findStandardDeviation(int[] values) {
        double mean = Arrays.stream(values).sum() / (values.length * 1.0);
        double[] distanceValues = Arrays.stream(values).mapToDouble(i -> Math.pow(i - mean, 2)).toArray();
        double standardDeviation = Math.sqrt(Arrays.stream(distanceValues).sum() / (values.length * 1.0));
        return DoubleUtil.round(standardDeviation, 1);
    }
}
