package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

/**
 * kawnayeen
 * 10/9/18
 */
public class _31_SherlockSquareTest {
    @Test
    public void testSquare() {
        _31_SherlockSquare sherlockSquare = new _31_SherlockSquare();
        Assert.assertEquals(3, sherlockSquare.squares(25,49));
        Assert.assertEquals(2, sherlockSquare.squares(3,9));
        Assert.assertEquals(0, sherlockSquare.squares(5,8));
    }
}