package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * kawnayeen
 * 3/9/18
 */
public class _6_ArrayManipulationTest {
    @Test
    public void testArrayManipulation() {
        int[][] queries = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}
        };
        _6_ArrayManipulation arrayManipulation = new _6_ArrayManipulation();
        Assert.assertEquals(200, arrayManipulation.arrayManipulation(5, queries));
    }
}