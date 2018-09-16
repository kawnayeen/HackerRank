package _10_days_of_statistics;

import util.DoubleUtil;

public class _4_GeometricDistributionII {
    double getGeometricDistribution(int totalEvent, double probabilityOfSuccess) {
        return Math.pow(1 - probabilityOfSuccess, totalEvent - 1) * probabilityOfSuccess;
    }

    String _4_getGeometricDistributionForN(int totalAttempt, double probabilityOfSuccess) {
        double outcome = 0f;
        for (int i = 1; i <= totalAttempt; i++)
            outcome += getGeometricDistribution(i, probabilityOfSuccess);
        return String.valueOf(DoubleUtil.round(outcome, 3));
    }
}
