package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _3_KangarooTest {
    @Test
    public void testKangaroo() {
        _3_Kangaroo kangaroo = new _3_Kangaroo();
        Assert.assertEquals(_3_Kangaroo.YES, kangaroo.kangaroo(0, 3, 4, 2));
        Assert.assertEquals(_3_Kangaroo.NO, kangaroo.kangaroo(0, 2, 5, 3));
        Assert.assertEquals(_3_Kangaroo.NO, kangaroo.kangaroo(21, 6, 47, 3));
        Assert.assertEquals(_3_Kangaroo.NO, kangaroo.kangaroo(21, 6, 47, 6));
    }
}