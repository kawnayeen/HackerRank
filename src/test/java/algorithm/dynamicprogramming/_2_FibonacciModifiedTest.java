package algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _2_FibonacciModifiedTest {

    @Test
    public void fibonacciModified() {
        _2_FibonacciModified fibModifier = new _2_FibonacciModified();
        Assert.assertEquals("5", fibModifier.fibonacciModified(0, 1, 5));
        Assert.assertEquals("27", fibModifier.fibonacciModified(0, 1, 6));
    }
}