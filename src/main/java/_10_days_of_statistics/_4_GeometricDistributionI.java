package _10_days_of_statistics;

import util.DoubleUtil;

public class _4_GeometricDistributionI {

    String getGeometricDistribution(int totalEvent, double probabilityOfSuccess) {
        double probabilityOfFailure = 1 - probabilityOfSuccess;
        double probabilityOfBeingFailureTillPriorDay = Math.pow(probabilityOfFailure, totalEvent - 1);
        double probabilityOfBeingSuccessOnNthDay = probabilityOfBeingFailureTillPriorDay * probabilityOfSuccess;
        return String.valueOf(DoubleUtil.round(probabilityOfBeingSuccessOnNthDay, 3));
    }
}