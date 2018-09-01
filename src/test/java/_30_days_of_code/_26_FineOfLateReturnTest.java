package _30_days_of_code;

import org.junit.Assert;
import org.junit.Test;

public class _26_FineOfLateReturnTest {
    @Test
    public void returnBeforeDueDateShouldCostNoFine() {
        _26_FineOfLateReturn fineOfLateReturn = new _26_FineOfLateReturn();
        Assert.assertEquals(0, fineOfLateReturn.fine("3 6 2015", "6 6 2015"));
        Assert.assertEquals(0, fineOfLateReturn.fine("31 12 2009", "1 1 2010"));
        Assert.assertEquals(0, fineOfLateReturn.fine("6 6 2015", "6 6 2015"));
        Assert.assertEquals(0, fineOfLateReturn.fine("6 3 2015", "6 6 2015"));
    }

    @Test
    public void testDaysOfFine(){
        _26_FineOfLateReturn fineOfLateReturn = new _26_FineOfLateReturn();
        Assert.assertEquals(45, fineOfLateReturn.fine("9 6 2015", "6 6 2015"));
    }

    @Test
    public void testMonthsOfFine(){
        _26_FineOfLateReturn fineOfLateReturn = new _26_FineOfLateReturn();
        Assert.assertEquals(1000, fineOfLateReturn.fine("9 8 2015", "6 6 2015"));
    }

    @Test
    public void testYearsOfFine(){
        _26_FineOfLateReturn fineOfLateReturn = new _26_FineOfLateReturn();
        Assert.assertEquals(10000, fineOfLateReturn.fine("9 6 2019", "6 6 2015"));
    }
}