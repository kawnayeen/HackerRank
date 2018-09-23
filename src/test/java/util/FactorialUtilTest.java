package util;


import org.junit.Assert;
import org.junit.Test;

public class FactorialUtilTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(1,FactorialUtil.getFactorial(0));
        Assert.assertEquals(1,FactorialUtil.getFactorial(1));
        Assert.assertEquals(2,FactorialUtil.getFactorial(2));
        Assert.assertEquals(6,FactorialUtil.getFactorial(3));
        Assert.assertEquals(24,FactorialUtil.getFactorial(4));
        Assert.assertEquals(120,FactorialUtil.getFactorial(5));
        Assert.assertEquals(720,FactorialUtil.getFactorial(6));
    }
}