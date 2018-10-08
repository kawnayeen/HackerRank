package algorithm.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _20_TwoStringsTest {

    @Test
    public void twoStrings() {
        _20_TwoStrings twoStrings = new _20_TwoStrings();
        Assert.assertEquals("YES", twoStrings.twoStrings("hello", "world"));
    }
}