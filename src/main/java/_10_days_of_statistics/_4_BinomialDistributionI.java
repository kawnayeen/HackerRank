package _10_days_of_statistics;

import util.DoubleUtil;

public class _4_BinomialDistributionI {

    protected int[] factorials;

    String getBinomialDistribution(int totalEvent, int minimumExpectedEvent, double probabilityOfSuccess) {
        populateFactorials(totalEvent);
        double probabilityOfFailure = 1 - probabilityOfSuccess;
        double outCome = 0f;
        for (int i = minimumExpectedEvent; i <= totalEvent; i++) {
            outCome += getCombination(totalEvent, i) * Math.pow(probabilityOfSuccess, i) * Math.pow(probabilityOfFailure, (totalEvent - i));
        }
        return String.valueOf(DoubleUtil.round(outCome, 3));
    }

    protected void populateFactorials(int totalEvent) {
        factorials = new int[totalEvent + 1];
        factorials[0] = 1;
        factorials[1] = 1;
        for (int i = 2; i <= totalEvent; i++)
            factorials[i] = i * factorials[i - 1];
    }

    protected int getCombination(int n, int r) {
        return factorials[n] / (factorials[r] * factorials[n - r]);
    }
}
