package datastructure.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 3/9/18
 */
public class _5_SparseArrayTest {
    @Test
    public void testOccurrence() {
        String[] strings = {"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf",
                "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"};
        String[] queries = {"abcde", "sdaklfj", "asdjf", "na", "basdn"};
        _5_SparseArray sparseArray = new _5_SparseArray();
        int[] occurrence = sparseArray.matchingStrings(strings, queries);
        int[] expected = {1, 3, 4, 3, 2};
        for (int i = 0; i < occurrence.length; i++) {
            Assert.assertEquals(expected[i], occurrence[i]);
        }
    }
}