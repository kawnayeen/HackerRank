package algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _18_CommonChildTest {
    _18_CommonChild commonChild;

    @Before
    public void init() {
        commonChild = new _18_CommonChild();
    }

    @Test
    public void testNoCommon() {
        Assert.assertEquals(0, commonChild.commonChild("ISH", "RAT"));
    }

    @Test
    public void testJata() {
        Assert.assertEquals(3, commonChild.commonChild("ABCD", "ABDC"));
        Assert.assertEquals(3, commonChild.commonChild("SHINCHAN", "NOHARAAA"));
        Assert.assertEquals(4, commonChild.commonChild("SHINCHANY", "NOHARAAAY"));
    }
}