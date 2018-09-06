package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

public class _14_CatAndMouseTest {
    @Test
    public void testCatAndMouse() {
        _14_CatAndMouse catAndMouse = new _14_CatAndMouse();
        Assert.assertEquals(_14_CatAndMouse.CAT_B, catAndMouse.catAndMouse(1, 2, 3));
        Assert.assertEquals(_14_CatAndMouse.MOUSE_C, catAndMouse.catAndMouse(1, 3, 2));
    }
}