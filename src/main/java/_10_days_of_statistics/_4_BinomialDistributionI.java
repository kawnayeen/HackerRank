package _10_days_of_statistics;

import util.DoubleUtil;
import util.FactorialUtil;

public class _4_BinomialDistributionI {

    String getBinomialDistribution(int totalEvent, int minimumExpectedEvent, double probabilityOfSuccess) {
        double probabilityOfFailure = 1 - probabilityOfSuccess;
        double outCome = 0f;
        for (int i = minimumExpectedEvent; i <= totalEvent; i++) {
            outCome += getCombination(totalEvent, i) * Math.pow(probabilityOfSuccess, i) * Math.pow(probabilityOfFailure, (totalEvent - i));
        }
        return String.valueOf(DoubleUtil.round(outCome, 3));
    }


    protected int getCombination(int n, int r) {
        return FactorialUtil.getFactorial(n) /
                (FactorialUtil.getFactorial(r) * FactorialUtil.getFactorial(n - r));
    }
}
