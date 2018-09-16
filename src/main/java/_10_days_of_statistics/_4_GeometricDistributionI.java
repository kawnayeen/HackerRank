package _10_days_of_statistics;

import util.DoubleUtil;

public class _4_GeometricDistributionI {

    String getGeometricDistribution(int totalEvent, double probabilityOfSuccess) {
        double outCome = Math.pow(1 - probabilityOfSuccess, totalEvent - 1) * probabilityOfSuccess;
        return String.valueOf(DoubleUtil.round(outCome, 3));
    }
}