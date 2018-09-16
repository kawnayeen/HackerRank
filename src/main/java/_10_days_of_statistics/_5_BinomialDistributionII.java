package _10_days_of_statistics;

import util.DoubleUtil;

public class _5_BinomialDistributionII extends _4_BinomialDistributionI {
    String getBinomialDistributionAtMost(int totalEvent, int maximumExpectedEvent, double probabilityOfSuccess) {
        populateFactorials(totalEvent);
        double probabilityOfFailure = 1 - probabilityOfSuccess;
        double outCome = 0f;
        for (int i = 0; i <= maximumExpectedEvent; i++) {
            outCome += getCombination(totalEvent, i) * Math.pow(probabilityOfSuccess, i) * Math.pow(probabilityOfFailure, (totalEvent - i));
        }
        return String.valueOf(DoubleUtil.round(outCome, 3));
    }
}
