package algorithm.implementation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _40_BiggerIsGreaterTest {

    @Test
    public void biggerIsGreater() {
        _40_BiggerIsGreater biggerIsGreater = new _40_BiggerIsGreater();
        Assert.assertEquals("no answer", biggerIsGreater.biggerIsGreater("bb"));
        Assert.assertEquals("no answer", biggerIsGreater.biggerIsGreater("dcba"));
        Assert.assertEquals("abdc", biggerIsGreater.biggerIsGreater("abcd"));
        Assert.assertEquals("dhkc", biggerIsGreater.biggerIsGreater("dhck"));
        Assert.assertEquals("hcdk", biggerIsGreater.biggerIsGreater("dkhc"));
    }
}