package _10_days_of_statistics;

import org.junit.Assert;
import org.junit.Test;

public class _5_PoissonDistributionITest {
    @Test
    public void testPoissonDistribution() {
        _5_PoissonDistributionI poissonDistribution = new _5_PoissonDistributionI();
        Assert.assertEquals(0.180,
                poissonDistribution.getPoissonDistribution(2f, 3),
                0.005f);
    }
}