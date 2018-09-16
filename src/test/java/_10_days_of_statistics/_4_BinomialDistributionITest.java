package _10_days_of_statistics;


import org.junit.Test;

public class _4_BinomialDistributionITest {
    @Test
    public void testBinomialDistribution() {
        _4_BinomialDistributionI binomialDistribution = new _4_BinomialDistributionI();
        System.out.println(binomialDistribution.getBinomialDistribution(
                6,
                3,
                1.09f / 2.09f
        ));
    }
}