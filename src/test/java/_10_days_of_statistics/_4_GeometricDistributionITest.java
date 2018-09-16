package _10_days_of_statistics;

import org.junit.Test;

public class _4_GeometricDistributionITest {
    @Test
    public void testGeometricDistribution() {
        _4_GeometricDistributionI geometricDistributionI = new _4_GeometricDistributionI();
        System.out.println(geometricDistributionI.getGeometricDistribution(3, .2));
    }
}