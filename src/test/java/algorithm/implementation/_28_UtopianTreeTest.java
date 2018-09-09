package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _28_UtopianTreeTest {
    @Test
    public void testUtopianTree(){
        _28_UtopianTree utopianTree = new _28_UtopianTree();
        Assert.assertEquals(14,utopianTree.utopianTree(5));
    }
}