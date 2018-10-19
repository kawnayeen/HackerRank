package algorithm.greedy;

import org.junit.Assert;
import org.junit.Test;

public class _5_PriyankaToysTest {
    @Test
    public void test() {
        _5_PriyankaToys priyankaToys = new _5_PriyankaToys();
        int[] input = {1, 2, 3, 21, 7, 12, 14, 21};
        Assert.assertEquals(4, priyankaToys.toys(input));
    }
}