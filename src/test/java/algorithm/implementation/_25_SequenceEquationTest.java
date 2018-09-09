package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _25_SequenceEquationTest {
    @Test
    public void testSequenceEquation() {
        int[] values = {5, 2, 1, 3, 4};
        _25_SequenceEquation sequenceEquation = new _25_SequenceEquation();
        int[] output = sequenceEquation.permutationEquation(values);
        Assert.assertEquals(4,output[0]);
        Assert.assertEquals(2,output[1]);
        Assert.assertEquals(5,output[2]);
        Assert.assertEquals(1,output[3]);
        Assert.assertEquals(3,output[4]);
    }
}