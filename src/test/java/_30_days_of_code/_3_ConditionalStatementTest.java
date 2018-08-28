package _30_days_of_code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _3_ConditionalStatementTest {
    _3_ConditionalStatement conditionalStatement;

    @Before
    public void setup() {
        conditionalStatement = new _3_ConditionalStatement();
    }

    @Test
    public void testForOdd() {
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(1));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(3));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(15));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(49));
    }

    @Test
    public void testForEvenBetweenTwoToFive() {
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(2));
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(4));
    }

    @Test
    public void testForEvenBetweenSixToTwenty() {
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(6));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(10));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(16));
        Assert.assertEquals(_3_ConditionalStatement.WEIRD, conditionalStatement.getFeedback(20));
    }

    @Test
    public void testForEvenGreaterThanTwenty() {
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(22));
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(38));
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(56));
        Assert.assertEquals(_3_ConditionalStatement.NOT_WEIRD, conditionalStatement.getFeedback(84));
    }
}