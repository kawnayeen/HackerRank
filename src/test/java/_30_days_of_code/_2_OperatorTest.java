package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

public class _2_OperatorTest {
    @Test
    public void testTotalCost() {
        _2_Operator operator = new _2_Operator();
        Assert.assertEquals(15, operator.calculateTotalCost(12.00, 20, 8));
    }
}