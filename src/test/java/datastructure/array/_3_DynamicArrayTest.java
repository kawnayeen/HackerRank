package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_DynamicArrayTest {
    @Test
    public void testDynamicArray() {
        int numberOfSequence = 2;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 0, 5));
        queries.add(Arrays.asList(1, 1, 7));
        queries.add(Arrays.asList(1, 0, 3));
        queries.add(Arrays.asList(2, 1, 0));
        queries.add(Arrays.asList(2, 1, 1));
        _3_DynamicArray dynamicArray = new _3_DynamicArray();
        List<Integer> output = dynamicArray.dynamicArray(numberOfSequence, queries);
        Assert.assertEquals(7, (int) output.get(0));
        Assert.assertEquals(3, (int) output.get(1));
    }
}