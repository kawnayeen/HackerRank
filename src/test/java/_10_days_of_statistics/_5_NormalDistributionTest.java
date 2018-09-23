package _10_days_of_statistics;

import org.junit.Test;

public class _5_NormalDistributionTest {
    @Test
    public void test() {
        _5_NormalDistribution normalDistribution = new _5_NormalDistribution();
        System.out.println(String.valueOf(
                normalDistribution.getCumulativeProbability(100,70,10) -
                        normalDistribution.getCumulativeProbability(80,70,10)
        ));

        System.out.println(String.valueOf(
                normalDistribution.getCumulativeProbability(100,70,10) -
                        normalDistribution.getCumulativeProbability(60,70,10)
        ));

        System.out.println(String.valueOf(
                normalDistribution.getCumulativeProbability(60, 70, 10)
        ));
    }
}